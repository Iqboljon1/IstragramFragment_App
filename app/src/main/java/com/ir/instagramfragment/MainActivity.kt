package com.ir.instagramfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.itemIconTintList = null
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navigationController)
    }
}