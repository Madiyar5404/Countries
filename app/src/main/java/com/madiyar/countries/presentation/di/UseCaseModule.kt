package com.madiyar.countries.presentation.di


import com.madiyar.domain.repository.CountryRepository
import com.madiyar.domain.usecase.GetCountries
import com.madiyar.domain.usecase.GetCountry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun providesUseCase(countryRepository: CountryRepository):GetCountries{
        return GetCountries((countryRepository))
    }

    @Provides
    @Singleton
    fun providesCountryUseCase(
        countryRepository: CountryRepository,
        @Named("cca2") cca2: String
    ): GetCountry {
        return GetCountry(countryRepository,cca2)
    }
    @Provides
    @Named("cca2")
    fun provideCca2(): String {
        return "ES" // Замените на ваше значение Cca2
    }

}