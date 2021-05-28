package com.dicoding.yusup.movieku.ui.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.R
import com.dicoding.yusup.movieku.databinding.FragmentMoBinding
import com.dicoding.yusup.movieku.viewmodel.MoViewModel

class MoFragment : Fragment(), MoFragmentCallback {

    private lateinit var fragmentMoBinding: FragmentMoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentMoBinding = FragmentMoBinding.inflate(layoutInflater, container, false)
        return fragmentMoBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MoViewModel::class.java]
            val movies = viewModel.getMovies()

            val movieAdapter = MoAdapter()
            movieAdapter.setMovies(movies)

            with(fragmentMoBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onShareClick(Movie: DataEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi ini sekarang")
                .setText(resources.getString(R.string.share_text, Movie.title))
                .startChooser()
        }
    }
}