package com.madiyar.domain.repository

import CountriesResponse

import com.madiyar.domain.model.CountriesResponseItem

interface CountryRepository {
    suspend fun getAllCountries(): CountriesResponse
    suspend fun getCountry(cca2:String): CountriesResponse
}