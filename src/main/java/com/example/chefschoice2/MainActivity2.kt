package com.example.chefschoice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val navController = findNavController(R.id.fl_wrapper)

        bottomNavigation.setupWithNavController(navController)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment , R.id.recipesFragment2, R.id.favoritesFragment, R.id.infoFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

    }
}
