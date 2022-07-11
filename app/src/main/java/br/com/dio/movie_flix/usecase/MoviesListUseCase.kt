package br.com.dio.movie_flix.usecase

import br.com.dio.movie_flix.data.MovieRepository

class MoviesListUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke() = movieRepository.getAllMoviesFromDataSource()
}