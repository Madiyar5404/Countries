package com.madiyar.countries.presentation.fragment.detail

import CountriesResponse
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope

import com.madiyar.domain.model.CountriesResponseItem
import com.madiyar.domain.usecase.GetCountry
import dagger.Provides
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val providesCountryUseCase: GetCountry) :
    ViewModel() {

    private var _countryLiveData = MutableLiveData<CountriesResponse?>()
    val countryLiveData: LiveData<CountriesResponse?>
        get() = _countryLiveData

    private var _status = MutableLiveData<Boolean>()
    val status: LiveData<Boolean>
        get() = _status

    fun getCodeCountry(cca2: String) {
        viewModelScope.launch {
            kotlin.runCatching {
                providesCountryUseCase.cca2 = cca2
                _countryLiveData.postValue(providesCountryUseCase())
            }.onSuccess {
                _status.postValue(true)
            }.onFailure {
                Log.d("AAA", it.message.toString())
                _status.postValue(false)
            }
        }
    }
}