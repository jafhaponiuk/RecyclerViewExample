package com.example.recyclerviewexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.adapter.SuperHeroAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        //val manager = GridLayoutManager(this, 2)
        //val decoration = DividerItemDecoration(this, manager.orientation)

        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)

        binding.recyclerSuperHero.layoutManager = manager
        //2do param corresponde a una función lambda
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(
            SuperHeroProvider.superHeroList
        )
        { superHero -> onItemSelected(superHero) }

        //binding.recyclerSuperHero.addItemDecoration(decoration)
    }

    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.superhero, Toast.LENGTH_SHORT).show()
    }
}