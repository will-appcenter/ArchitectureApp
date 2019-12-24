package com.example.archmvpapp

/**
 * Created by Carlo Matulessy on 24/12/2019.
 * Copyright © 2019 Carlo Matulessy. All rights reserved.
 *
 * The presenter is responsible for handeling changes in the UI
 *
 */
class MainPresenter : MainContract.MainPresenter {

    private var mView: MainContract.MainView? = null

    override fun calculateResult(inputA: String, inputB: String) {
        val result = inputA.toDoubleOrNull()?.let { safeInputA ->
            inputB.toDoubleOrNull()?.let { safeInputB ->
                (safeInputA + safeInputB).toString()
            }
        } ?: "Nothing"

        mView?.showCalculatedResult(result)
    }

    override fun isViewBounded(): Boolean = mView != null

    override fun unBindView() {
        mView = null
    }

    override fun bindView(view: MainContract.MainView) {
        mView = view
    }
}