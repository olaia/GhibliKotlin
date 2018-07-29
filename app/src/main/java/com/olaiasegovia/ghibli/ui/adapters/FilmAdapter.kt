package com.olaiasegovia.ghibli.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olaiasegovia.ghibli.R
import com.olaiasegovia.ghibli.domain.model.FilmList
import kotlinx.android.synthetic.main.film_list_item.view.*

class FilmAdapter(private val films: FilmList) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvFilmName?.text = films.list[position].title
    }

    override fun onCreateViewHolder(holder: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(holder.context).inflate(R.layout.film_list_item, holder, false))
    }

    override fun getItemCount(): Int {
        return films.list.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvFilmName = view.tv_film_name!!
    }

}
