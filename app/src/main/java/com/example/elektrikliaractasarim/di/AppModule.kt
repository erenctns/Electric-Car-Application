package com.example.elektrikliaractasarim.di

import com.example.elektrikliaractasarim.data.datasource.ArabalarDataSource
import com.example.elektrikliaractasarim.data.repo.ArabalarRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideArabalarDataSource():ArabalarDataSource{
        return ArabalarDataSource()
    }
    @Provides
    @Singleton
    fun provideArabalarRepository(ads:ArabalarDataSource):ArabalarRepository{
        return ArabalarRepository(ads)
    }
}