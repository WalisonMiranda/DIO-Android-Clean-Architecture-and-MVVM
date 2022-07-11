package br.com.dio.movie_flix.implementations

import android.util.Log
import br.com.dio.movie_flix.framework.api.MovieRestApiTask
import br.com.dio.movie_flix.data.MovieDataSource
import br.com.dio.movie_flix.domain.Movie

class MovieDataSourceImplementation(private val movieRestApiTask: MovieRestApiTask) :
    MovieDataSource {

    companion object {
        const val TAG = "MovieRepository"
    }

    private val movieList = arrayListOf<Movie>()

    override fun getAllMovies(): List<Movie> {
        val request = movieRestApiTask.retrofitApi().getAllMovies().execute()

        if (request.isSuccessful) {
            request.body()?.let {
                movieList.addAll(it)
            }
        } else {
            request.errorBody()?.let {
                Log.d(TAG, it.toString())
            }
        }

        return movieList
    }


}