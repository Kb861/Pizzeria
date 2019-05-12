package com.example.pizzeria




class CheeseDecorator(var pizza: AbstractPizza) : AbstractPizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName()+"Ser"  }

    override fun getPrice(): Double {
        return pizza.getPrice()+5.60  }


}