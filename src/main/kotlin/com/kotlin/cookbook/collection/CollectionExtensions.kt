package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 06/04/22 9:37 AM
 **/
fun Customer.getOrderedProductsSequence(): Sequence<Product> {
  return this.orders.asSequence().flatMap(Order::products)
}

fun Customer.getOrderedProducts(): List<Product> = this.orders.flatMap(Order::products)