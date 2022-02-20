package com.example.utoilets1.data

import com.example.utoilets1.R
import com.example.utoilets1.model.Bathrooms

class Datasource {

    fun loadBathrooms(): List<Bathrooms> {
        return listOf<Bathrooms>(
            Bathrooms(R.string.bathroom_1),
            Bathrooms(R.string.bathroom_1_description)
        )
    }
}