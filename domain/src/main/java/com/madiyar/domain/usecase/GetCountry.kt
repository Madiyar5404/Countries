package com.madiyar.domain.usecase

import com.madiyar.domain.repository.CountryRepository

class GetCountry(private val countryRepository: CountryRepository, var cca2:String) {
    suspend operator fun invoke() = countryRepository.getCountry(cca2)
}