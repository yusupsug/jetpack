package com.dicoding.yusup.movieku.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.utils.DataJoin

class TsViewModel : ViewModel() {

    fun getTvShows(): List<DataEntity> = DataJoin.generateTvShowList()
}