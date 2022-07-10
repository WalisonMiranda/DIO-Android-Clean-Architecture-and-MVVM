package br.com.dio.arquitetura_mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.dio.arquitetura_mvvm.R
import br.com.dio.arquitetura_mvvm.model.Movie
import br.com.dio.arquitetura_mvvm.viewmodel.MovieListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var movieListViewModel: MovieListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieListViewModel = ViewModelProvider.NewInstanceFactory()
            .create(MovieListViewModel::class.java)
        movieListViewModel.init()

        initObserver()
    }

    private fun initObserver() {
        movieListViewModel.moviesList.observe(this, Observer { list ->
            populateList(list)
        })
    }

    private fun populateList(list: List<Movie>) {
        moviesList.apply {

            hasFixedSize()
            adapter = MoviesAdapter(list)

        }
    }
}