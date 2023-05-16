package com.madiyar.countries.presentation.fragment.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.madiyar.domain.model.CountriesResponse
import com.madiyar.domain.usecase.GetCountries
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(private val getCountriesUseCase: GetCountries) :
    ViewModel() {

    private var _countriesLiveData = MutableLiveData<CountriesResponse?>()
    val countriesLiveData: LiveData<CountriesResponse?>
        get() = _countriesLiveData

    private var _getScrollAccess = MutableLiveData<Boolean>()
    val getScrollAccess: LiveData<Boolean>
        get() = _getScrollAccess

    private var _getCodeCountry = MutableLiveData<String>()
    val getCodeCountry: LiveData<String>
        get() = _getCodeCountry


    fun getCountries() {
        viewModelScope.launch {
            try {
                _countriesLiveData.postValue(getCountriesUseCase())
            } catch (e: Exception) {
                Log.d("AAA", e.message.toString())
            }
        }
    }

    fun itemScrollClick(click:Boolean){
        _getScrollAccess.postValue(click)
    }
    fun itemGetCountryClick(codeCountry:String){
        _getCodeCountry.postValue(codeCountry)
    }
}