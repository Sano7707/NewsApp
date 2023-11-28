package com.loc.newsapp.domain.manager.manager

import kotlinx.coroutines.flow.Flow


interface LocalUserManager {
    suspend fun saveAppEntry()

    fun readAppEntry(): Flow<Boolean>
}