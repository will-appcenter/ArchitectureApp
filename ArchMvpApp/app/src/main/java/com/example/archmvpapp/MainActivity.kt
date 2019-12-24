package com.example.archmvpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.archmvpapp.databinding.ActivityMainBinding

/**
 * Created by Carlo Matulessy on 07/12/2019.
 * Copyright © 2019 Carlo Matulessy. All rights reserved.
 *
 * Displays the screen
 *
 */
class MainActivity : AppCompatActivity(), MainContract.MainView {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = MainPresenter(this)

        binding.buttonAdd.setOnClickListener {
            presenter.calculateResult(
                binding.inputAEditText.text.toString(),
                binding.inputBEditText.text.toString()
            )
        }
    }

    override fun showCalculatedResult(result: String) {
        binding.answerTextView.text = result
    }
}
