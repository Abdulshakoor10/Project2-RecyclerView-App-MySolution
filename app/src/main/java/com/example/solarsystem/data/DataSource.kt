package com.example.solarsystem.data

import com.example.solarsystem.model.Planet
import com.example.solarsystem.R

class DataSource {

    fun loadList() : List<Planet> {
        return listOf<Planet>(
            Planet(R.string.mercury_number,R.drawable.mercury, R.string.mercury_moons, R.string.mercury_in_Arabic, R.string.mercury_size),
            Planet(R.string.venus_number, R.drawable.venus, R.string.venus_moons, R.string.venus_in_Arabic, R.string.venus_size),
            Planet(R.string.earth_number, R.drawable.earth, R.string.earth_moons, R.string.earth_in_Arabic, R.string.earth_size),
            Planet(R.string.mars_number, R.drawable.mars, R.string.mars_moons, R.string.mars_in_Arabic, R.string.mars_size),
            Planet(R.string.jupiter_number, R.drawable.jupiter, R.string.jupiter_moons, R.string.jupiter_in_Arabic, R.string.jupiter_size),
            Planet(R.string.saturn_number, R.drawable.saturn, R.string.saturn_moons, R.string.saturn_in_Arabic, R.string.saturn_size),
            Planet(R.string.uranus_number, R.drawable.uranus, R.string.uranus_moons, R.string.uranus_in_Arabic, R.string.uranus_size),
            Planet(R.string.neptune_number, R.drawable.neptune, R.string.neptune_moons, R.string.neptune_in_Arabic, R.string.neptune_size),
            Planet(R.string.pluto_number, R.drawable.pluto, R.string.pluto_moons, R.string.pluto_in_Arabic, R.string.pluto_size)
        )
    }// End loadList()

}// End DataSource class