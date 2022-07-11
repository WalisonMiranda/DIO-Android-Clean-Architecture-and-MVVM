package br.com.dio.movieflix.data

import br.com.dio.movieflix.domain.Movie

interface MovieDataSource {

    fun getAllMovies(): List<Movie>
}