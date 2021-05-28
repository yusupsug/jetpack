package com.dicoding.yusup.movieku.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TsViewModelTest {

    private lateinit var viewModel: TsViewModel

    @Before
    fun setUp() {
        viewModel = TsViewModel()
    }

    @Test
    fun getMovies() {
        val dataEntities = viewModel.getTvShows()
        assertNotNull(dataEntities)
        assertEquals(12, dataEntities.size)
    }
}