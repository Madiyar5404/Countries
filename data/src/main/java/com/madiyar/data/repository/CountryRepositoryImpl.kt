package com.madiyar.data.repository

import CountriesResponse
import com.madiyar.data.service.ApiService
import com.madiyar.domain.model.CountriesResponseItem
import com.madiyar.domain.repository.CountryRepository

class CountryRepositoryImpl(private val apiService: ApiService):CountryRepository {

    override suspend fun getAllCountries(): CountriesResponse {
        return apiService.getAllCountries()
    }
    override suspend fun getCountry(cca2:String): CountriesResponse {
        return apiService.getCountry(cca2)
    }

}