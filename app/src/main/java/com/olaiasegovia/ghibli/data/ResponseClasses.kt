package com.olaiasegovia.ghibli.data

data class FilmResponse(val list: List<Film>)
data class Film(val id: String,
                val title: String,
                val description: String ? = "",
                val director: String ? = "",
                val release_date: String ? = "",
                val score: Int)
