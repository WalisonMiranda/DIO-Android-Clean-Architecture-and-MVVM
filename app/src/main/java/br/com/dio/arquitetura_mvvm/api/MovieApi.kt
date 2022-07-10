package br.com.dio.arquitetura_mvvm.api

import br.com.dio.arquitetura_mvvm.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    @GET("natanfelipe/FilmesFlixJson/master/moviesList")
    fun getAllMovies(): Call<List<Movie>>
}