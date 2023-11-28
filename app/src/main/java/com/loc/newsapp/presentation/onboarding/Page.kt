package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R
import com.loc.newsapp.util.Constants

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = Constants.FIRST_TITLE,
        description = Constants.description1,
        image = R.drawable.first
    ),
    Page(
        title = Constants.SECOND_TITLE,
        description = Constants.description2,
        image = R.drawable.second
    ),
    Page(
        title = Constants.THIRD_TITLE,
        description =  Constants.description3,
        image = R.drawable.third
    )
)