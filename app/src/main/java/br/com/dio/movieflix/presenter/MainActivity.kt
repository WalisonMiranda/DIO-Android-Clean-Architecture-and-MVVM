package br.com.dio.movieflix.presenter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.dio.movieflix.R
import br.com.dio.movieflix.domain.Movie
import br.com.dio.movieflix.framework.viewmodel.MovieListViewModel
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
        loadingVisibility(true)
    }

    private fun initObserver() {
        movieListViewModel.moviesList.observe(this, Observer { list ->
            if (list.isNotEmpty()) {
                populateList(list)
                loadingVisibility(false)
            }
        })
    }

    private fun populateList(list: List<Movie>) {
        moviesList.apply {

            hasFixedSize()
            adapter = MoviesAdapter(list)

        }
    }

    private fun loadingVisibility(isLoading: Boolean) {
        progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
    }
}