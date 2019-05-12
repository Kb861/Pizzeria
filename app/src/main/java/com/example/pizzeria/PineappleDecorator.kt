package com.example.pizzeria




class PineappleDecorator(var pizza: AbstractPizza) : AbstractPizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName()+"Ananas"  }

    override fun getPrice(): Double {
        return pizza.getPrice()+10  }


}