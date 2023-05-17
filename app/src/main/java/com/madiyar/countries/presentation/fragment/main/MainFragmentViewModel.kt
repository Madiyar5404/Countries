package com.madiyar.countries.presentation.fragment.main

import CountriesResponse
import android.app.usage.UsageEvents.Event
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.madiyar.domain.model.ArgumentCountryDetails
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

    private var _getCodeCountry = MutableLiveData<ArgumentCountryDetails>()
    val getCodeCountry: LiveData<ArgumentCountryDetails>
        get() = _getCodeCountry

    private var _status = MutableLiveData<Boolean>()
    val status: LiveData<Boolean>
        get() = _status

    fun getCountries() {
        viewModelScope.launch {
            kotlin.runCatching { _countriesLiveData.postValue(getCountriesUseCase()) }
                .onSuccess {
                    _status.postValue(true)
                }.onFailure {
                    Log.d("AAA", it.message.toString())
                    _status.postValue(false)
                }

        }
    }

    fun itemScrollClick(click:Boolean){
        _getScrollAccess.postValue(click)
    }
    fun itemGetCountryClick(arg:ArgumentCountryDetails){
        _getCodeCountry.postValue(arg)
    }
}