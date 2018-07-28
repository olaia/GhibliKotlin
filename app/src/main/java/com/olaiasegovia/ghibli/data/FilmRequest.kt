package com.olaiasegovia.ghibli.data

import android.util.Log
import com.google.gson.Gson
import java.net.URL

class FilmRequest() {

    companion object {
    private val URL = "https://ghibliapi.herokuapp.com/filmsØ"

    }

    fun run(): Film {
        val filmsJsonStr = URL(URL).readText()
        Log.d(javaClass.simpleName, filmsJsonStr)
        return Gson().fromJson(filmsJsonStr, Film::class.java)
    }
}