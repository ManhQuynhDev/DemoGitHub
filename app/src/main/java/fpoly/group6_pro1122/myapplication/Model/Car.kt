package fpoly.group6_pro1122.myapplication.Model

import java.io.Serializable

open class Car(private var brand: String, private var price: Int, private var color: String) :
    Serializable {
    fun getBrand(): String {
        return brand
    }
    fun setBrand(newBrand: String) {
        brand = newBrand
    }
    fun getPrice(): Int {
        return price
    }
    fun setPrice(newPrice: Int) {
        price = newPrice
    }
    fun getColor(): String {
        return color
    }
    fun setColor(newColor: String) {
        color = newColor
    }
}