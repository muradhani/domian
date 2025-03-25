package com.example.domain.models

data class RecipeEntity(
    var id: Int? = null,
    var title: String? = null,
    var imageUrl : String? = null,
    var publisher: String? = null,
    var rating: Int? = null,
    var sourceUrl: String? = null,
    var description: String? = null,
    var cookingInstructions: String? = null,
    var ingredients: List<String?>? = null,
    var dateAdded: String? = null,
    var dateUpdated: String? = null,
)
