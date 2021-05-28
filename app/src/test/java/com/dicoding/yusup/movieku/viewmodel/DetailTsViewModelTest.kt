package com.dicoding.yusup.movieku.viewmodel

import com.dicoding.yusup.movieku.utils.DataJoin
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTsViewModelTest {

    private lateinit var viewModel: DetailTsViewModel
    private val dataTs = DataJoin.generateTvShowList()[0]
    private val Id = dataTs.Id

    @Before
    fun setUp() {
        viewModel = DetailTsViewModel()
        viewModel.setSelectedTvShow(Id)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedTvShow(dataTs.Id)
        val tSEntity = viewModel.getTvShow()
        assertNotNull(tSEntity)
        assertEquals(dataTs.Id, tSEntity.Id)
        assertEquals(dataTs.title, tSEntity.title)
        assertEquals(dataTs.gen, tSEntity.gen)
        assertEquals(dataTs.dircre, tSEntity.dircre)
        assertEquals(dataTs.ov, tSEntity.ov)
        assertEquals(dataTs.imgPath, tSEntity.imgPath)
    }
}