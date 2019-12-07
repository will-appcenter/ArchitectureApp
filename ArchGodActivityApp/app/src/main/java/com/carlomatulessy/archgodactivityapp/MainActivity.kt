package com.carlomatulessy.archgodactivityapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.carlomatulessy.archgodactivityapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            val inputA = binding.inputAEditText.text.toString().toDouble()
            val inputB = binding.inputBEditText.text.toString().toDouble()

            binding.answerTextView.text = (inputA + inputB).toString()
        }
    }
}
