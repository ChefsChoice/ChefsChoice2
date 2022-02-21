package com.example.chefschoice2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.chefschoice2.Fragments.FavoritesFragment
import com.example.chefschoice2.Fragments.HomeFragment
import com.example.chefschoice2.Fragments.InfoFragment
import com.example.chefschoice2.Fragments.RecipesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActbutton = findViewById<Button>(R.id.secondActivityBtn)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)

        }
    }

}
