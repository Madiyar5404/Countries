package com.madiyar.countries.presentation.di

import com.madiyar.data.repository.CountryRepositoryImpl
import com.madiyar.data.service.ApiService
import com.madiyar.domain.repository.CountryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideRepository(apiService: ApiService): CountryRepository {
        return CountryRepositoryImpl(apiService)
    }
}