package com.madiyar.domain.usecase

import com.madiyar.domain.repository.CountryRepository

class GetCountries(private val countryRepository: CountryRepository) {
    suspend operator fun invoke() = countryRepository.getAllCountries()
}
