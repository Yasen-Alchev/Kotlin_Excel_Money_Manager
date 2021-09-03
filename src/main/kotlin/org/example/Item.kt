package org.example

class Item(val name: String?, val price: Double?) {
    override fun toString(): String {
        return "$name -> ${price}lv\n"
    }
}