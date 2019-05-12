package com.example.pizzeria

import android.view.View

interface RecyclerViewClickListener {
    fun onClick(view: View, position: Int, name: String)
}