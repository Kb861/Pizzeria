package com.example.pizzeria

class Pizza : AbstractPizza() {

    override fun getName(): String {
        return "Margarita"
    }

    override fun getPrice(): Double {
        return 20.00
    }
}