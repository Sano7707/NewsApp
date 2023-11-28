package com.loc.newsapp.di

import android.app.Application
import com.loc.newsapp.data.manager.LocalUserMangerImpl
import com.loc.newsapp.domain.manager.manager.LocalUserManager
import com.loc.newsapp.domain.manager.usecases.AppEntryUseCases
import com.loc.newsapp.domain.manager.usecases.ReadAppEntry
import com.loc.newsapp.domain.manager.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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

}