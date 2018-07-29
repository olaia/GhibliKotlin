package com.olaiasegovia.ghibli.domain.commands

import com.olaiasegovia.ghibli.data.FilmRequest
import com.olaiasegovia.ghibli.domain.mappers.FilmDataMapper
import com.olaiasegovia.ghibli.domain.model.FilmList

class RequestFilmCommand() : Command<FilmList> {
    override fun execute(): FilmList {
        val filmRequest = FilmRequest()
        return FilmDataMapper().convertFromDataModel(filmRequest.execute())
    }
}