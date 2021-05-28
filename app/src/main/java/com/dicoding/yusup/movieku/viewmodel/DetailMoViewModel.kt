package com.dicoding.yusup.movieku.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.utils.DataJoin

class DetailMoViewModel : ViewModel(){
    private lateinit var Id: String

    fun setSelectedMovie(Id: String) {
        this.Id = Id
    }

    fun getMovie(): DataEntity {
        lateinit var movie: DataEntity
        val dataEntities = DataJoin.generateMovieList()
        for (dataEntity in dataEntities) {
            if (dataEntity.Id == Id) {
                movie = dataEntity
            }
        }
        return movie
    }
}