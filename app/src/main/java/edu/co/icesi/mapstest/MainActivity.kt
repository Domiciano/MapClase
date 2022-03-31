package edu.co.icesi.mapstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.co.icesi.mapstest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val fragment: MapsFragment by lazy{
        MapsFragment()
    }

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragContainer, fragment)
        transaction.commit()
    }
}