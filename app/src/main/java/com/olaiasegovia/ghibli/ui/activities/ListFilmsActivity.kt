package com.olaiasegovia.ghibli.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.olaiasegovia.ghibli.R
import com.olaiasegovia.ghibli.domain.commands.RequestFilmCommand
import com.olaiasegovia.ghibli.ui.adapters.FilmAdapter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread

class ListFilmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_films)

        var filmList = find<RecyclerView>(R.id.rv_film_list)
        filmList.layoutManager = LinearLayoutManager(this)

        doAsync {
            val result = RequestFilmCommand().execute()
            uiThread {
                filmList.adapter = FilmAdapter(result)
            }
        }
    }
}
