package com.madiyar.countries.presentation.adapter

import CountriesResponse
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madiyar.countries.databinding.AdapterRcContinentsBinding
import com.madiyar.countries.presentation.fragment.main.MainFragmentViewModel
import com.madiyar.countries.presentation.ui_common.RecyclerViewItemClickCallback
import com.madiyar.countries.presentation.ui_common.RecyclerViewScrollItemClickCallback
import com.madiyar.domain.model.ArgumentCountryDetails
import com.madiyar.domain.model.Continent

class ContinentAdapter(
    private val mainFragmentViewModel: MainFragmentViewModel
): RecyclerView.Adapter< RecyclerView.ViewHolder>() {

    private lateinit var countriesList:CountriesResponse
    private val continentsList = ArrayList<Continent>()
    private val adapterCountries = CountriesAdapter(mainFragmentViewModel)

    fun submitAllList(list: CountriesResponse){
        countriesList = list
    }

    fun submitContinentsList(list: ArrayList<Continent>){
        continentsList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemBinding = AdapterRcContinentsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }
    inner class ViewHolder(var binding:AdapterRcContinentsBinding):RecyclerView.ViewHolder(binding.root){
        fun initContent(
            continent: Continent
        ) {
            binding.tvNameOfContinent.text = continent.continent

            Log.d("AAA", continentsList.toString())

            val countriesContinent = CountriesResponse()
            for (i in countriesList){
                for (j in i.continents)
                    if(continent.continent == j){
                        countriesContinent.add(i)
                    }
            }
            adapterCountries.submitList(countriesContinent)
            adapterCountries.setViewModel(mainFragmentViewModel)
            binding.rcViewCountries.adapter = adapterCountries

            adapterCountries.setOnItemScrollClickListener(object : RecyclerViewScrollItemClickCallback{
                override fun onRecyclerViewScrollItemClick(access: Boolean) {
                    mainFragmentViewModel.itemScrollClick(access)
                }
            })
            adapterCountries.setOnItemClickListener(object :RecyclerViewItemClickCallback{
                override fun onRecyclerViewItemClick(argumentCountryDetails: ArgumentCountryDetails) {
                    mainFragmentViewModel.itemGetCountryClick(argumentCountryDetails)
                }

            })
        }
    }

    override fun getItemCount(): Int  = continentsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as ContinentAdapter.ViewHolder
        viewHolder.initContent(continentsList[position])
    }
}