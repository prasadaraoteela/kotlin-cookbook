package com.kotlin.cookbook.collection

import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Created by Prasada Rao on 05/04/22 5:38 PM
 **/
val testCustomers = listOf(
  Customer(
    name = "Customer 5",
    city = City(name = "City 96"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 11", price = 110.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 12", price = 120.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 13", price = 130.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 13", price = 130.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 10", price = 100.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 12", price = 120.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 2", price = 20.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 2", price = 20.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 11", price = 110.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 1", price = 10.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 10",
    city = City(name = "City 161"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 11", price = 110.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 11", price = 110.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 8", price = 80.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 7", price = 70.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 12", price = 120.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 1",
    city = City(name = "City 29"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 18", price = 180.0)
        ), isDelivered = true
      )
    )
  ), Customer(
    name = "Customer 10",
    city = City(name = "City 155"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 1", price = 10.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = true
      )
    )
  ), Customer(
    name = "Customer 6",
    city = City(name = "City 186"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 16", price = 160.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 12", price = 120.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 10", price = 100.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 2", price = 20.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 14", price = 140.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 4",
    city = City(name = "City 48"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 2", price = 20.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 3",
    city = City(name = "City 10"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 15", price = 150.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 14", price = 140.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 2",
    city = City(name = "City 166"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 14", price = 140.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 2", price = 20.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 6",
    city = City(name = "City 36"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 18", price = 180.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 5", price = 50.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 19", price = 190.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 10", price = 100.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 10", price = 100.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 5", price = 50.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 8", price = 80.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 3", price = 30.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 20", price = 200.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 17", price = 170.0)
        ), isDelivered = false
      )
    )
  ), Customer(
    name = "Customer 4",
    city = City(name = "City 7"),
    orders = listOf(
      Order(
        products = listOf(
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 17", price = 170.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 18", price = 180.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 8", price = 80.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 9", price = 90.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 11", price = 110.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 17", price = 170.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 6", price = 60.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 8", price = 80.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 10", price = 100.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 5", price = 50.0),
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 13", price = 130.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 1", price = 10.0)
        ), isDelivered = true
      ),
      Order(
        products = listOf(
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 16", price = 160.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 7", price = 70.0),
          Product(name = "Product 15", price = 150.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 12", price = 120.0),
          Product(name = "Product 8", price = 80.0),
          Product(name = "Product 3", price = 30.0),
          Product(name = "Product 14", price = 140.0),
          Product(name = "Product 7", price = 70.0)
        ), isDelivered = false
      ),
      Order(
        products = listOf(
          Product(name = "Product 4", price = 40.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 6", price = 60.0),
          Product(name = "Product 2", price = 20.0),
          Product(name = "Product 1", price = 10.0),
          Product(name = "Product 4", price = 40.0)
        ), isDelivered = true
      )
    )
  )
)

val testShop = Shop(
  name = "Test Shop", customers = testCustomers
)

val testCustomer = testCustomers.first()
val testOrder = testCustomer.orders.first()
val testProduct = testOrder.products.first()

fun main() {
  println(generateTestCustomerData())
}

private fun generateTestCustomerData(maxCustomers: Int = 10): List<Customer> {
  val customers = ArrayList<Customer>()
  repeat(maxCustomers) {
    customers.add(
      Customer(
        name = "Customer ${Random.nextInt(1..maxCustomers)}",
        city = getRandomCity(),
        orders = generateTestOrderData(Random.nextInt(1..20))
      )
    )
  }
  return customers
}

private fun generateTestOrderData(maxCount: Int): List<Order> {
  val orders = ArrayList<Order>()
  repeat(maxCount) {
    orders.add(
      Order(
        products = generateTestProductsData(Random.nextInt(5..20)),
        isDelivered = listOf(true, false).random()
      )
    )
  }
  return orders
}

private fun getRandomCity(): City {
  return City(name = "City ${Random.nextInt(1..200)}")
}

private fun generateTestProductsData(maxProducts: Int = 5): List<Product> {
  val products = ArrayList<Product>()
  repeat(maxProducts) {
    val productNumber = Random.nextInt(1..maxProducts)
    products.add(
      Product(
        name = "Product $productNumber",
        price = (productNumber * 10.0).roundOff()
      )
    )
  }
  return products
}

private fun Double.roundOff(decimalPoints: Int = 2): Double =
  (this * 10.0.pow(decimalPoints)).roundToInt() / 10.0.pow(decimalPoints)