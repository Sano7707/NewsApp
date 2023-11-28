package com.loc.newsapp.domain.manager.usecases

import com.loc.newsapp.domain.manager.manager.LocalUserManager


class SaveAppEntry(
    private val localUserManger: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}