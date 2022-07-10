package br.com.dio.arquitetura_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.dio.arquitetura_mvvm.model.Movie

class MovieListViewModel: ViewModel() {

    private val listOfMovies = arrayListOf(
        Movie(
            id = 0,
            title = "Titanic",
            description = null,
            genre = null,
            image = null,
            releaseYear = null
        ),Movie(
            id = 1,
            title = "Central do Brasil",
            description = null,
            genre = null,
            image = null,
            releaseYear = null
        ),Movie(
            id = 2,
            title = "Piratas do Caribe",
            description = null,
            genre = null,
            image = null,
            releaseYear = null
        ),Movie(
            id = 3,
            title = "Avengers",
            description = null,
            genre = null,
            image = null,
            releaseYear = null
        ),Movie(
            id = 4,
            title = "John Wick",
            description = null,
            genre = null,
            image = null,
            releaseYear = null
        )
    )

    private var _moviesList = MutableLiveData<List<Movie>>()
    val moviesList: LiveData<List<Movie>>
        get() = _moviesList

    fun init() {
        getAllMovies()
    }

    private fun getAllMovies() {
        _moviesList.value = listOfMovies
    }

}