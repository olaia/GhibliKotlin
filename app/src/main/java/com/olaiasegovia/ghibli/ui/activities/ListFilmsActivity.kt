package com.olaiasegovia.ghibli.data

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.olaiasegovia.ghibli.R
import kotlinx.android.synthetic.main.activity_list_films.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

class ListFilmsActivity : AppCompatActivity() {

    val films: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_films)

        addFilms()

        retrieveDataFromServer()

        rv_film_list.layoutManager = LinearLayoutManager(this)

        rv_film_list.adapter = FilmAdapter(films, this)
    }

    private fun retrieveDataFromServer() {

        doAsync {
            val result = FilmRequest().execute()
            uiThread{
                longToast("FilmRequest performed")
            }
        }
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
