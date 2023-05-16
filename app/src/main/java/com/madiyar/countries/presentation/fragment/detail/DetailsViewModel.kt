package com.madiyar.countries.presentation.fragment.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.madiyar.domain.model.CountriesResponse
import com.madiyar.domain.usecase.GetCountry
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

class DetailsViewModel @Inject constructor(private val getCountryUseCase: GetCountry) :
    ViewModel()  {

    private var _countryLiveData = MutableLiveData<CountriesResponse.CountriesResponseItem?>()
    val countryLiveData: LiveData<CountriesResponse.CountriesResponseItem?>
        get() = _countryLiveData


    fun getCodeCountry(cca:String) {
        viewModelScope.launch {
            try {
                _countryLiveData.postValue(getCountryUseCase())
            } catch (e: Exception) {
                Log.d("AAA", e.message.toString())
            }
        }
    }
}