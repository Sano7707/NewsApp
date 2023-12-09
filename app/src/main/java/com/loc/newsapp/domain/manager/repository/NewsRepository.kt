package com.loc.newsapp.domain.manager.repository

import androidx.paging.PagingData
import com.loc.newsapp.domain.manager.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getNews(sources: List<String>): Flow<PagingData<Article>>

    fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>>
}