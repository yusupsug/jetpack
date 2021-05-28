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
import com.dicoding.yusup.movieku.databinding.FragmentTsBinding
import com.dicoding.yusup.movieku.viewmodel.TsViewModel

class TsFragment :  Fragment(), TsFragmentCallback {

    lateinit var fragmentTsBinding: FragmentTsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentTsBinding = FragmentTsBinding.inflate(inflater, container, false)
        return fragmentTsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TsViewModel::class.java]
            val tvShows = viewModel.getTvShows()

            val adapter = TsAdapter(this)
            adapter.setTvShow(tvShows)

            with(fragmentTsBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

    override fun onShareClick(tvShow: DataEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi ini sekarang")
                .setText(resources.getString(R.string.share_text, tvShow.title))
                .startChooser()
        }
    }
}