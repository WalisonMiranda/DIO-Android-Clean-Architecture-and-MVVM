package br.com.dio.arquitetura_mvvm.usecase

import br.com.dio.arquitetura_mvvm.data.MovieRepository

class MoviesListUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke() = movieRepository.getAllMoviesFromDataSource()
}