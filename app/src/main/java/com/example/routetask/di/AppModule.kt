package com.example.routetask.di

import com.example.routetask.network.ApiService
import com.example.routetask.network.RetrofitInstance
import com.example.routetask.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideApiService(): ApiService {
        return RetrofitInstance.api
    }

    @Provides
    fun provideProductRepository(apiService: ApiService): ProductRepository {
        return ProductRepository(apiService)
    }
}
