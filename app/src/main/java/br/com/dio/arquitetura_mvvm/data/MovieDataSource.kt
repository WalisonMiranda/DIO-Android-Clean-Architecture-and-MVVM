package br.com.dio.arquitetura_mvvm.data

import br.com.dio.arquitetura_mvvm.domain.Movie

interface MovieDataSource {

    fun getAllMovies(): List<Movie>
}