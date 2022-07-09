package br.com.dio.arquitetura_mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dio.arquitetura_mvvm.R
import br.com.dio.arquitetura_mvvm.model.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun populateList() {
        moviesList.apply {

            hasFixedSize()
            adapter = MoviesAdapter(listOfMovies)

        }
    }
}