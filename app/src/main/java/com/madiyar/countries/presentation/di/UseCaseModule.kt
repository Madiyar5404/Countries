package com.madiyar.countries.presentation.di


import com.madiyar.domain.repository.CountryRepository
import com.madiyar.domain.usecase.GetCountries
import com.madiyar.domain.usecase.GetCountry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun providesUseCase(countryRepository: CountryRepository):GetCountries{
        return GetCountries((countryRepository))
    }

    @Provides
    fun providesCountryUseCase(countryRepository: CountryRepository, cca2:String): GetCountry {
        return GetCountry(countryRepository,cca2)
    }
}