package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 06/04/22 9:34 AM
 **/
object Sequences {

  // Find the most expensive product among all the delivered products
  // ordered by the customer. Use `Order.isDelivered` flag.
  private fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer
      .orders
      .asSequence()
      .filter(Order::isDelivered)
      .flatMap(Order::products)
      .maxByOrNull(Product::price)
  }

  // Count the amount of times a product was ordered.
  // Note that a customer may order the same product several times.
  private fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
      .asSequence()
      .flatMap(Customer::getOrderedProductsSequence)
      .count { it == product }
  }

  @JvmStatic
  fun main(args: Array<String>) {
    println(findMostExpensiveProductBy(testCustomers[0]))
    println(testShop.getNumberOfTimesProductWasOrdered(testProduct))
  }
}