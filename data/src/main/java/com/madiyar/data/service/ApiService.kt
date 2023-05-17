package com.madiyar.data.service

import CountriesResponse
import com.madiyar.domain.model.CountriesResponseItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("all")
    suspend fun getAllCountries():CountriesResponse

    @GET("alpha/{cca2}")
    suspend fun getCountry(
        @Path("cca2")cca2:String
    ): CountriesResponse
}