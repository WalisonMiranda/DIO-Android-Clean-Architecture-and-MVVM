package br.com.dio.movie_flix.data

import br.com.dio.movie_flix.domain.Movie

interface MovieDataSource {

    fun getAllMovies(): List<Movie>
}