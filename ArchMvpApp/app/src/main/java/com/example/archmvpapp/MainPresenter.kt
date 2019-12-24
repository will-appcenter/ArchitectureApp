package com.example.archmvpapp

/**
 * Created by Carlo Matulessy on 24/12/2019.
 * Copyright © 2019 Carlo Matulessy. All rights reserved.
 *
 * The presenter is responsible for handeling changes in the UI
 *
 */
class MainPresenter(
    private val view: MainContract.MainView
) : MainContract.MainPresenter {

    override fun calculateResult(inputA: String, inputB: String) {
        val result = inputA.toDoubleOrNull()?.let { safeInputA ->
            inputB.toDoubleOrNull()?.let { safeInputB ->
                (safeInputA + safeInputB).toString()
            }
        } ?: "Nothing"

        view.showCalculatedResult(result)
    }

}