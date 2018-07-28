package com.olaiasegovia.ghibli

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.film_list_item.view.*

class FilmAdapter(private val films: ArrayList<String>, private val context: ListFilmsActivity) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvFilmName?.text = films[position]
    }

    override fun onCreateViewHolder(holder: ViewGroup, viewType: Int): ViewHolder{
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.film_list_item, holder, false))
    }

    override fun getItemCount(): Int {
        return films.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val tvFilmName = view.tv_film_name!!
    }

}
