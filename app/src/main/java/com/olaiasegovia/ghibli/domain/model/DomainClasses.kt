package domain

import java.util.*

data class FilmResponse  (val id: String, val title: String, val description: String, val director: String, val releaseDate: Date, val score: Int)