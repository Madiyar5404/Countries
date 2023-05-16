package com.madiyar.data.service

import com.madiyar.domain.model.CountriesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("all")
    suspend fun getAllCountries():CountriesResponse

    @GET("alpha/[countryCode/cca2]")
    suspend fun getCountry(
        @Query("[countryCode/cca2]")cca2:String
    ):CountriesResponse.CountriesResponseItem
}