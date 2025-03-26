package com.example.domain.repositories

import com.example.domain.models.RecipeEntity

interface RecipeRepository {
    suspend fun search(token: String, page: Int, query: String): List<RecipeEntity>?
    suspend fun get(token:String , id:Int):RecipeEntity?
}