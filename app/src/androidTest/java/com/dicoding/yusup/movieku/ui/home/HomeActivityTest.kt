package com.dicoding.yusup.movieku.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.yusup.movieku.R
import com.dicoding.yusup.movieku.utils.DataJoin
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {
    private val dataMovie = DataJoin.generateMovieList()
    private val dataTs = DataJoin.generateTvShowList()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)


    @Test
    fun loadMovies() {
        Espresso.onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
                ViewActions.click()
            ))
        Espresso.onView(withId(R.id.tv_title))
            .check(ViewAssertions.matches(withText(dataMovie[0].title)))
        Espresso.onView(withId(R.id.tv_date))
            .check(ViewAssertions.matches(withText(dataMovie[0].date)))
        Espresso.onView(withId(R.id.tv_genre))
            .check(ViewAssertions.matches(withText(dataMovie[0].gen)))
        Espresso.onView(withId(R.id.tv_director))
            .check(ViewAssertions.matches(withText(dataMovie[0].dircre)))
        Espresso.onView(withId(R.id.tv_overview))
            .check(ViewAssertions.matches(withText(dataMovie[0].ov)))
    }

    @Test
    fun loadTvShow() {
        Espresso.onView(ViewMatchers.withText("TV Show")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tvShow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rv_tvShow))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTs.size))
    }
}