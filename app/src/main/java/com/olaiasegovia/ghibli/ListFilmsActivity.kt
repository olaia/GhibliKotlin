package com.olaiasegovia.ghibli

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_films.*

class ListFilmsActivity : AppCompatActivity() {

    val films: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_films)

        addFilms()

        rv_film_list.layoutManager = LinearLayoutManager(this)

        rv_film_list.adapter = FilmAdapter(films, this)
    }

    private fun addFilms() {
        films.add("Castle in the Sky")
        films.add("Grave of the Fireflies")
        films.add("Kiki's Delivery Service")
        films.add("Only Yesterday")
        films.add("Porco Rosso")
        films.add("Pom Poko")
        films.add("Whisper of the Heart")
        films.add("Princess Mononoke")
    }
}
