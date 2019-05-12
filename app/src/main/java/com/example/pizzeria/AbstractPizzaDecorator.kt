package com.example.pizzeria

abstract class AbstractPizzaDecorator(pizza: AbstractPizza) : AbstractPizza() {
    abstract override fun getName(): String
}