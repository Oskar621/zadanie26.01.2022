package com.example.zadanie26012022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast
import com.example.zadanie26012022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupCheckedTextView()
        CheckedTextView2()
    }
    private fun setupCheckedTextView() {
        val checkedTextView1 = binding.checkedTextView
        checkedTextView1.isChecked = false
        checkedTextView1.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

        checkedTextView1.setOnClickListener {
            checkedTextView1.isChecked = !checkedTextView1.isChecked
            checkedTextView1.setCheckMarkDrawable(
                if (checkedTextView1.isChecked)
                    android.R.drawable.checkbox_on_background
                else
                    android.R.drawable.checkbox_off_background)

            val msg =
                getString(R.string.pre_msg) + " " + getString(
                    if (checkedTextView1.isChecked)
                        R.string.checked
                    else
                        R.string.unchecked)
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }
    private fun CheckedTextView2() {
        val checkedTextView2 = binding.checkedTextView2
        checkedTextView2.isChecked = false
        checkedTextView2.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

        checkedTextView2.setOnClickListener {
            checkedTextView2.isChecked = !checkedTextView2.isChecked
            checkedTextView2.setCheckMarkDrawable(
                if (checkedTextView2.isChecked)
                    android.R.drawable.checkbox_off_background
                else
                    android.R.drawable.checkbox_on_background)

            val msg2 =
                getString(R.string.pre_msg2) + " " + getString(
                if (checkedTextView2.isChecked)
                    R.string.checked
                else
                    R.string.unchecked)

            Toast.makeText(this@MainActivity, msg2,Toast.LENGTH_SHORT).show()
        }
    }
}