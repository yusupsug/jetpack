package com.dicoding.yusup.movieku.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.R
import com.dicoding.yusup.movieku.databinding.ActivityDetailTsBinding
import com.dicoding.yusup.movieku.databinding.ContentDetailTvShowBinding
import com.dicoding.yusup.movieku.viewmodel.DetailTsViewModel

class DetailTsActivity : AppCompatActivity() {
    private lateinit var detailTsBinding: ContentDetailTvShowBinding

    companion object {
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailTsBinding = ActivityDetailTsBinding.inflate(layoutInflater)
        detailTsBinding = activityDetailTsBinding.detailContent

        setContentView(activityDetailTsBinding.root)

        setSupportActionBar(activityDetailTsBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTsViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val tvShowId = extras.getString(EXTRA_TVSHOW)
            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId)
                kumpulTvShow(viewModel.getTvShow() )
            }
        }
    }

    private fun kumpulTvShow(dataEntity: DataEntity) {
        detailTsBinding.tvTitle.text = dataEntity.title
        detailTsBinding.tvDate.text = dataEntity.date
        detailTsBinding.tvGenre.text = dataEntity.gen
        detailTsBinding.tvCreator.text = dataEntity.dircre
        detailTsBinding.tvOverview.text = dataEntity.ov

        Glide.with(this)
            .load(dataEntity.imgPath)
            .transform(RoundedCorners(12))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
            .error(R.drawable.ic_error)
            .into(detailTsBinding.imagePoster)
    }
}