package com.olaiasegovia.ghibli.domain.mappers

import com.olaiasegovia.ghibli.data.Film
import com.olaiasegovia.ghibli.data.FilmResponse
import com.olaiasegovia.ghibli.domain.model.FilmList
import com.olaiasegovia.ghibli.domain.model.Film as ModelFilm

class FilmDataMapper {

    fun convertFromDataModel(films: FilmResponse): FilmList =
            FilmList(convertFilmListToDomain(films.list))

    private fun convertFilmListToDomain(list: List<Film>): List<ModelFilm> {
        return list.mapIndexed { i, film ->
            convertFilmItemToDomain(film)
        }
    }

    private fun convertFilmItemToDomain(film: Film): ModelFilm {
        return ModelFilm(film.title, film.description!!, film.director!!, film.release_date?.toInt())
    }
}
