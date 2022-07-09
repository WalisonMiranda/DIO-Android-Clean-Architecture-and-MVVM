package br.com.dio.arquitetura_mvvm.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import br.com.dio.arquitetura_mvvm.R
import br.com.dio.arquitetura_mvvm.model.Movie
import kotlinx.android.synthetic.main.movie_item_layout.view.*

class MoviesAdapter(private val moviesList: List<Movie>): RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        return MoviesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.itemView.apply {
            movieTitle.text = moviesList[position].title
            movieImage.load(moviesList[position].image) {
                placeholder(R.drawable.ic_image)
                fallback(R.drawable.ic_image)
            }
        }
    }

    override fun getItemCount(): Int = moviesList.size



}