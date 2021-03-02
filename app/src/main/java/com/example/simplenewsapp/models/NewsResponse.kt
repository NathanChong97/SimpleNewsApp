package com.example.simplenewsapp.models

import com.example.simplenewsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)