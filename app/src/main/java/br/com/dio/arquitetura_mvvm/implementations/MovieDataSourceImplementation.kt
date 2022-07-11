package br.com.dio.arquitetura_mvvm.implementations

import android.util.Log
import br.com.dio.arquitetura_mvvm.framework.api.MovieRestApiTask
import br.com.dio.arquitetura_mvvm.data.MovieDataSource
import br.com.dio.arquitetura_mvvm.domain.Movie

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