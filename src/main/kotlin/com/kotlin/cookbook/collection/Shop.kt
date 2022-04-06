package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 05/04/22 5:33 PM
 **/
data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
  override fun toString() = """
    Customer(
        name = "$name",
        city = $city,
        orders = listOf($orders)
      )
  """.trimIndent()
}

data class Order(val products: List<Product>, val isDelivered: Boolean) {
  override fun toString(): String {
    return """
      Order(products = listOf($products), isDelivered = $isDelivered)
    """.trimIndent()
  }
}

data class Product(val name: String, val price: Double) {

  override fun toString(): String {
    return "Product(name = \"$name\", price = $price)"
  }
}

data class City(val name: String) {
  override fun toString() = """
    City(name = "$name")
  """.trimIndent()
}