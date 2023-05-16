package com.madiyar.countries.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.madiyar.countries.R
import com.madiyar.countries.databinding.AdapterRcCountryBinding
import com.madiyar.countries.presentation.fragment.main.MainFragmentViewModel
import com.madiyar.countries.presentation.ui_common.RecyclerViewItemClickCallback
import com.madiyar.countries.presentation.ui_common.RecyclerViewScrollItemClickCallback
import com.madiyar.domain.model.CountriesResponse

class CountriesAdapter(
    private var mainFragmentViewModel: MainFragmentViewModel
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var accessScroll = false
    private var countryCode = "ES"

    private val diffCallback =
        object : DiffUtil.ItemCallback<CountriesResponse.CountriesResponseItem>() {
            override fun areItemsTheSame(
                oldItem: CountriesResponse.CountriesResponseItem,
                newItem: CountriesResponse.CountriesResponseItem
            ): Boolean {
                return oldItem.name.official == newItem.name.official
            }

            override fun areContentsTheSame(
                oldItem: CountriesResponse.CountriesResponseItem,
                newItem: CountriesResponse.CountriesResponseItem
            ): Boolean {
                return oldItem == newItem
            }

        }

    private var listener: RecyclerViewScrollItemClickCallback? = null
    private var listenerItem: RecyclerViewItemClickCallback? = null
    fun setOnItemScrollClickListener(listener: RecyclerViewScrollItemClickCallback) {
        this.listener = listener
    }

    fun setOnItemClickListener(listener: RecyclerViewItemClickCallback) {
        this.listenerItem = listener
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    fun submitList(list: CountriesResponse) {
        differ.submitList(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemBinding =
            AdapterRcCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    fun setViewModel(viewModel: MainFragmentViewModel) {
        this.mainFragmentViewModel = viewModel
        viewModel.getScrollAccess.observeForever { newData ->
            accessScroll = newData
        }
    }

    inner class ViewHolder(var binding: AdapterRcCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun initContent(item: CountriesResponse.CountriesResponseItem) {
            Glide.with(itemView.context)
                .load(item.flags.png) // Замените URL на фактический путь к изображению
                .into(binding.tvImgCountry)
            binding.tvCountryNameOfficial.text = item.name.common
            binding.tvCapitalNameOfficial.text = item.capital[0]
            binding.tvCountPopulation.text = "${item.population} mln"


            binding.btnShowAdditionalInfo.setOnClickListener {
                if (accessScroll) {
                    listener?.onRecyclerViewScrollItemClick(true)
                    binding.tvFieldScroll.visibility = View.VISIBLE
                    mainFragmentViewModel.itemScrollClick(false)
                    binding.btnShowAdditionalInfo.background = ContextCompat.getDrawable(itemView.context,
                        R.drawable.icon_btn_up)
                } else {
                    listener?.onRecyclerViewScrollItemClick(false)
                    binding.tvFieldScroll.visibility = View.GONE
                    mainFragmentViewModel.itemScrollClick(true)
                    binding.btnShowAdditionalInfo.background = ContextCompat.getDrawable(itemView.context,R.drawable.icon_btn_down)
                }

            }
            binding.btnLearnMore.setOnClickListener {
                mainFragmentViewModel.itemGetCountryClick(item.cca2)
            }


        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as ViewHolder
        viewHolder.initContent(differ.currentList[position])
    }


}