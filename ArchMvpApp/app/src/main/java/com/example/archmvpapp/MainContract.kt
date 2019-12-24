package com.example.archmvpapp

/**
 * Created by Carlo Matulessy on 24/12/2019.
 * Copyright © 2019 Carlo Matulessy. All rights reserved.
 *
 * Defines the contract between the view (MainActivity) and the presenter (MainPresenter)
 *
 */
interface MainContract {
    interface MainView {
        fun showCalculatedResult(result: String)
    }

    interface MainPresenter {
        fun calculateResult(inputA: String, inputB: String)
    }
}