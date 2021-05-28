package com.dicoding.yusup.movieku.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.R
import com.dicoding.yusup.movieku.databinding.ActivityDetailMoBinding
import com.dicoding.yusup.movieku.databinding.ContentDetailMovieBinding
import com.dicoding.yusup.movieku.viewmodel.DetailMoViewModel

class DetailMoActivity : AppCompatActivity() {

    private lateinit var detilIsiBinding: ContentDetailMovieBinding

    companion object {
        const val EXTRA_MO = "extra_mo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailMoBinding = ActivityDetailMoBinding.inflate(layoutInflater)
        detilIsiBinding = activityDetailMoBinding.detailContent

        setContentView(activityDetailMoBinding.root)

        setSupportActionBar(activityDetailMoBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMoViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val Id = extras.getString(EXTRA_MO)
            if(Id != null) {
                viewModel.setSelectedMovie(Id)
                kumpulMovie(viewModel.getMovie())
            }
        }
    }

    private fun kumpulMovie(dataEntity: DataEntity) {
        detilIsiBinding.tvTitle.text = dataEntity.title
        detilIsiBinding.tvDate.text = dataEntity.date
        detilIsiBinding.tvGenre.text = dataEntity.gen
        detilIsiBinding.tvDirector.text = dataEntity.dircre
        detilIsiBinding.tvOverview.text = dataEntity.ov

        Glide.with(this)
            .load(dataEntity.imgPath)
            .transform(RoundedCorners(12))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
            .error((R.drawable.ic_error))
            .into(detilIsiBinding.imagePoster)
    }
}
