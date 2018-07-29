package com.olaiasegovia.ghibli.data

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URL

class FilmRequest {

    companion object {
        private const val URL = "https://ghibliapi.herokuapp.com/films"
    }

    fun execute(): FilmResponse {
        val filmsJsonStr = URL(URL).readText()
        return FilmResponse(Gson().fromJson(filmsJsonStr, object : TypeToken<List<Film>>() {}.type))
    }
}