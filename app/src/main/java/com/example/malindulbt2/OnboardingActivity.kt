package com.example.malindulbt2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardingActivity: AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var nextBtn: Button
    private lateinit var skipBtn: Button
    private lateinit var adapter: OnboardingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbordnamebutton)

        viewPager = findViewById(R.id.viewPager)
        nextBtn = findViewById(R.id.nextBtn)
        skipBtn = findViewById(R.id.skipBtn)

        val layouts = listOf(
            R.layout.onbordscreen1,
            R.layout.onbordscreen2,
            R.layout.onbordscreen3
        )

        adapter = OnboardingAdapter(this, layouts)
        viewPager.adapter = adapter

        nextBtn.setOnClickListener {
            if (viewPager.currentItem < layouts.size - 1) {
                viewPager.currentItem++
            } else {
                startActivity(Intent(this, entryscreen::class.java))
                finish()
            }
        }

        skipBtn.setOnClickListener {
            startActivity(Intent(this, entryscreen::class.java))
            finish()
        }
    }
}
