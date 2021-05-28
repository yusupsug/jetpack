package com.dicoding.yusup.movieku.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.utils.DataJoin

class MoViewModel : ViewModel() {

    fun getMovies(): List<DataEntity> = DataJoin.generateMovieList()
}