package com.dicoding.yusup.movieku.viewmodel

import com.dicoding.yusup.movieku.utils.DataJoin
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMoViewModelTest {

    private lateinit var viewModel: DetailMoViewModel
    private val dataMovie = DataJoin.generateMovieList()[0]
    private val Id = dataMovie.Id

    @Before
    fun setUp() {
        viewModel = DetailMoViewModel()
        viewModel.setSelectedMovie(Id)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dataMovie.Id)
        val dataEntity = viewModel.getMovie()
        assertNotNull(dataEntity)
        assertEquals(dataMovie.Id, dataEntity.Id)
        assertEquals(dataMovie.title, dataEntity.title)
        assertEquals(dataMovie.date, dataEntity.date)
        assertEquals(dataMovie.gen, dataEntity.gen)
        assertEquals(dataMovie.dircre, dataEntity.dircre)
        assertEquals(dataMovie.ov, dataEntity.ov)
        assertEquals(dataMovie.imgPath, dataEntity.imgPath)
    }
}