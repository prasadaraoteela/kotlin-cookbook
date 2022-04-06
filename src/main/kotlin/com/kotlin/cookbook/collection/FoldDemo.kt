package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 05/04/22 5:33 PM
 **/
object FoldDemo {

  private fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts: Set<Product> = customers.flatMap(Customer::getOrderedProducts).toSet()
    return customers.fold(allProducts) { orderedByAll, customer ->
      return orderedByAll.intersect(customer.getOrderedProducts().toSet())
    }
  }

  @JvmStatic
  fun main(args: Array<String>) {
    println(testShop.getProductsOrderedByAll())
  }
}

