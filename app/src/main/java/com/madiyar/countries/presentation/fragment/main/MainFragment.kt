package com.madiyar.countries.presentation.fragment.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.madiyar.countries.databinding.FragmentMainBinding
import com.madiyar.countries.presentation.adapter.ContinentAdapter
import com.madiyar.domain.model.Continent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null
    private val mainFragmentViewModel: MainFragmentViewModel by viewModels()

    private val continentList = ArrayList<Continent>()
    private val afterSortingList = ArrayList<Continent>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            shimmerLayout.startShimmer()
            shimmerLayout.visibility = View.VISIBLE
            rcViewContinents.visibility = View.INVISIBLE
            toolBarMain.back.visibility = View.GONE
        }
        observeViewModel()
    }

    fun observeViewModel(){
        mainFragmentViewModel.getCountries()
        mainFragmentViewModel.status.observe(viewLifecycleOwner,Observer{
            if (it){
                binding?.apply {
                    rcViewContinents.visibility = View.VISIBLE
                    shimmerLayout.visibility = View.GONE
                    shimmerLayout.stopShimmer()
                }
            }
        })
        mainFragmentViewModel.countriesLiveData.observe(viewLifecycleOwner, Observer {
            if(it!=null){
                for(i in it){
                    for(j in i.continents){
                        continentList.add(Continent(j))
                    }
                }
                for (i in continentList.distinctBy{it.continent} ){
                    afterSortingList.add(i)
                }

                val adapter = ContinentAdapter(mainFragmentViewModel)
                adapter.submitAllList(it)
                adapter.submitContinentsList(afterSortingList)
                binding?.rcViewContinents?.adapter = adapter
            }
        })
        mainFragmentViewModel.getCodeCountry.observe(viewLifecycleOwner,Observer{
            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment(it.cca2,it.countryName)
            findNavController().navigate(action,navOptions = null)

        })
    }
    override fun onResume() {
        super.onResume()
        setToolBar()
    }

    private fun setToolBar() {
        binding?.toolBarMain
    }

}