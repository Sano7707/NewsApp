package com.loc.newsapp.di

import android.app.Application
import com.loc.newsapp.data.manager.LocalUserMangerImpl
import com.loc.newsapp.data.manager.remote.NewsApi
import com.loc.newsapp.data.manager.repository.NewsRepositoryImpl
import com.loc.newsapp.domain.manager.repository.NewsRepository
import com.loc.newsapp.domain.manager.usecases.app_entry.AppEntryUseCases
import com.loc.newsapp.domain.manager.usecases.app_entry.ReadAppEntry
import com.loc.newsapp.domain.manager.usecases.app_entry.SaveAppEntry
import com.loc.newsapp.domain.manager.usecases.news.GetNews
import com.loc.newsapp.domain.manager.usecases.news.NewsUseCases
import com.loc.newsapp.domain.manager.usecases.news.SearchNews
import com.loc.newsapp.domain.manager.manager.LocalUserManager
import com.loc.newsapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

    @Provides
    @Singleton
    fun provideApiInstance(): NewsApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi
    ): NewsRepository {
        return NewsRepositoryImpl(newsApi)
    }

    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository)
        )
    }

}