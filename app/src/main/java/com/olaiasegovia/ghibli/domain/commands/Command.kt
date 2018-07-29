package com.olaiasegovia.ghibli.domain.commands

interface Command<out T> {
    fun execute(): T
}