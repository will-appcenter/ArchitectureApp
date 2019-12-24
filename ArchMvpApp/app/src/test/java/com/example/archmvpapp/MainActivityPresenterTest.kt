package com.example.archmvpapp

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

/**
 * Created by Carlo Matulessy on 07/12/2019.
 * Copyright © 2019 Carlo Matulessy. All rights reserved.
 *
 */
class MainActivityPresenterTest {

    @Test
    fun `Given the method calculateResult is given the correct result`() {
        // Arrange
        val view = TestView()
        val presenter = MainPresenter(view)

        // Act
        presenter.calculateResult("1", "1")

        // Assert
        assertEquals("2.0", view.result)
    }

    class TestView : MainContract.MainView {

        var result: String = "NOTHING"

        override fun showCalculatedResult(result: String) {
            this.result = result
        }
    }
}