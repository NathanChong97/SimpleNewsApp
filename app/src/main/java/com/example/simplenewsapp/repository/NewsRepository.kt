package com.example.simplenewsapp.repository

import com.example.simplenewsapp.api.RetrofitInstance
import com.example.simplenewsapp.db.ArticleDatabase
import com.example.simplenewsapp.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode = countryCode, pageNumber = pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery = searchQuery, pageNumber = pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsertArticle(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}