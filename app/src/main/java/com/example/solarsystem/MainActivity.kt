package com.example.solarsystem

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.adapter.ItemAdapter
import com.example.solarsystem.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data Source
        val planetList = DataSource().loadList()  //invoke constructor thin use its function

        // Adapter
        val planetAdapter = ItemAdapter(this, planetList)

        // RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_planets)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        recyclerView.adapter = planetAdapter
        recyclerView.setHasFixedSize(true)


    }
}


