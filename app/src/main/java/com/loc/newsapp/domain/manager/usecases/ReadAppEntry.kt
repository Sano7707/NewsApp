package com.loc.newsapp.domain.manager.usecases

import com.loc.newsapp.domain.manager.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger: LocalUserManager
) {

    operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }

}