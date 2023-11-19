package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Israel-Hamas war live: Israeli army continues ‘pounding’ southern Gaza",
        description = "About 31 Palestinians have been killed in separate strikes that took place at the Nuseirat ... ",
        image = R.drawable.first
    ),
    Page(
        title = "US and China to resume high-level military communication",
        description = "US President Joe Biden and Chinese leader Xi Jinping have agreed to resume high-level ...",
        image = R.drawable.second
    ),
    Page(
        title = "Armenia and Azerbaijan have agreed on basic peace treaty principles",
        description = "The two countries have been at odds for decades, most notably over the breakaway region of ... ",
        image = R.drawable.third
    )
)