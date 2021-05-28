package com.dicoding.yusup.movieku.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.utils.DataJoin

class DetailTsViewModel : ViewModel() {

    private lateinit var Id: String

    fun setSelectedTvShow(Id: String) {
        this.Id = Id
    }

    fun getTvShow(): DataEntity {
        lateinit var tvShow: DataEntity
        val tvShowEntities = DataJoin.generateTvShowList()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.Id == Id) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}