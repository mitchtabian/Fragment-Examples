package com.codingwithmitch.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentFactory: MainFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentFactory = MainFragmentFactory("Cool, I used a Fragment Factory.")
        supportFragmentManager.fragmentFactory = fragmentFactory

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, BlankFragment::class.java, null)
            .commit()
    }
}
