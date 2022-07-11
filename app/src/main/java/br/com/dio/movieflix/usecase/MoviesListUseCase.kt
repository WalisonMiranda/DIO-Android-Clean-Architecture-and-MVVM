package br.com.dio.movieflix.usecase

import br.com.dio.movieflix.data.MovieRepository

class MoviesListUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke() = movieRepository.getAllMoviesFromDataSource()
}