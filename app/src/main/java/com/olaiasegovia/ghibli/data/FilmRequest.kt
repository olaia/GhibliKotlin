package com.olaiasegovia.ghibli.data

import com.google.gson.Gson
import java.net.URL

class FilmRequest() {

    companion object {
    private const val URL = "https://ghibliapi.herokuapp.com/filmsØ"

    }

    fun execute(): FilmResponse {
        val filmsJsonStr = URL(URL).readText()
        return Gson().fromJson(filmsJsonStr, FilmResponse::class.java)
    }
}