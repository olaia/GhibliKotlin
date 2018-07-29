package com.olaiasegovia.ghibli.domain.model

data class FilmList(val list: List<Film>)
data class Film(val title: String, val description: String, val director: String, val releaseYear: Int?)
