package com.dicoding.yusup.movieku.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MoViewModelTest {

    private lateinit var viewModel: MoViewModel

    @Before
    fun setUp() {
        viewModel = MoViewModel()
    }

    @Test
    fun getMovies() {
        val dataEntities = viewModel.getMovies()
        assertNotNull(dataEntities)
        assertEquals(12, dataEntities.size)
    }

}