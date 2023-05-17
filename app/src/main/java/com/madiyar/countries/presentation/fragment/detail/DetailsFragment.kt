package com.madiyar.countries.presentation.fragment.detail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import androidx.lifecycle.viewmodel.ViewModelInitializer
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.madiyar.countries.R
import com.madiyar.countries.databinding.FragmentDetailsBinding
import com.madiyar.domain.model.CountriesResponseItem
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private var binding: FragmentDetailsBinding? = null
    private val args: DetailsFragmentArgs by navArgs()

    private val detailsViewModel: DetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            shimmerLayout.startShimmer()
            shimmerLayout.visibility = View.VISIBLE
            detailField.visibility = View.GONE
            toolBarDetail.tvToolbar.text = args.country
            toolBarDetail.back.visibility = View.VISIBLE
            toolBarDetail.back.setOnClickListener {
                val action = DetailsFragmentDirections.actionDetailsFragmentToMainFragment()
                val transaction = NavOptions.Builder().setEnterAnim(androidx.navigation.ui.R.anim.nav_default_pop_exit_anim)
                findNavController().navigate(action,transaction.build())
            }
        }
        observeViewModel()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val action = DetailsFragmentDirections.actionDetailsFragmentToMainFragment()
                val transaction = NavOptions.Builder().setEnterAnim(androidx.navigation.ui.R.anim.nav_default_pop_exit_anim)
                findNavController().navigate(action,transaction.build())
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun observeViewModel(){
        detailsViewModel.getCodeCountry(args.cca2)
        detailsViewModel.status.observe(viewLifecycleOwner,Observer{
            if (it){
                binding?.apply {
                    detailField.visibility = View.VISIBLE
                    shimmerLayout.visibility = View.GONE
                    shimmerLayout.stopShimmer()
                }
            }
        })
        detailsViewModel.countryLiveData.observe(viewLifecycleOwner,Observer{
            if(it != null){
                val country = it.get(0)
                binding?.apply {
                    Glide.with(requireContext())
                        .load(country.flags.png) // Замените URL на фактический путь к изображению
                        .into(tvImgCountry as ImageView)
                    tvCapitalCountry.text = country.capital[0]
                    tvCoordinates.text = "${country.capitalInfo.latlng[0]}',${country.capitalInfo.latlng[1]}'"
                    tvArea.text = "${country.area.toInt()} km2"

                    for (currencyCode in country.currencies.javaClass.declaredFields) {
                        currencyCode.isAccessible = true
                        val currencyData = currencyCode.get(country.currencies)
                        if (currencyData != null) {
                            val currencyNameField = currencyData.javaClass.getDeclaredField("name")
                            currencyNameField.isAccessible = true
                            val currencyName = currencyNameField.get(currencyData)
                            val currencySymbolField = currencyData.javaClass.getDeclaredField("symbol")
                            currencySymbolField.isAccessible = true
                            val currencySymbol = currencySymbolField.get(currencyData)
                            tvCurrency.text = "$currencyName ($currencySymbol) (${currencyData.toString().substringBeforeLast("(")})"
                            break
                        }
                    }
                    tvRegion.text = "${country.subregion}"
                    var timezoneText = ""
                    for(zone in country.timezones){
                        timezoneText += "${zone.substringBeforeLast(":")}\n"
                    }
                    tvTimezone.text = "${timezoneText}"
                }
            }
        })
    }
    override fun onResume() {
        super.onResume()
        setToolBar()
    }

    private fun setToolBar() {

    }
}