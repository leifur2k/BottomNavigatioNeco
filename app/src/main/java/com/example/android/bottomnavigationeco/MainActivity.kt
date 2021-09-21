package com.example.android.bottomnavigationeco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.bottomnavigationeco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.bottomNav?.setOnItemSelectedListener { item ->

            when(item.itemId){
                R.id.sync -> binding?.textView?.text = "Sync"
                R.id.delete -> binding?.textView?.text = "Delete"
                R.id.save -> binding?.textView?.text = "Save"
                R.id.search -> binding?.textView?.text = "Search"
            }

            return@setOnItemSelectedListener true

        }

    }
}