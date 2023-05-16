package com.madiyar.domain.repository

import com.madiyar.domain.model.CountriesResponse

interface CountryRepository {
    suspend fun getAllCountries(): CountriesResponse
    suspend fun getCountry(cca2:String):CountriesResponse.CountriesResponseItem
}