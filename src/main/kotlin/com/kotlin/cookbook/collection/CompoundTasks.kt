package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 05/04/22 8:22 PM
 **/
object CompoundTasks {
  // Find the most expensive product among all the delivered products
  // ordered by the customer. Use `Order.isDelivered` flag.
  private fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer
      .orders
      .filter { it.isDelivered }
      .flatMap { it.products }
      .maxByOrNull { it.price }
  }

  // Count the amount of times a product was ordered.
  // Note that a customer may order the same product several times.
  private fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
      .flatMap { it.orders }
      .flatMap { it.products }
      .count { it == product }
  }

  @JvmStatic
  fun main(args: Array<String>) {
    println(testShop.getNumberOfTimesProductWasOrdered(testProduct))
    println(findMostExpensiveProductBy(testCustomer))
  }
}