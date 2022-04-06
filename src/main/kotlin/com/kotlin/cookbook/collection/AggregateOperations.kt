package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 05/04/22 4:56 PM
 **/
object AggregateOperations {

  private fun foldAndReduce() {
    val numbers = listOf(5, 2, 10, 4)

    val strings = listOf("a", "b", "c", "d")

    println(
      numbers.fold(0) { accumulator, number ->
        accumulator + number
      }
    )

    println(
      numbers.reduce { accumulator, number ->
        accumulator + number
      }
    )

    println(strings.reduce { acc, s -> acc + s })
    println(strings.reduceIndexed { index, acc, s -> acc + (if (index == 1) index else "") + s + (index + 1) })

    println(strings.foldIndexed("") { index, acc, s -> acc + s + (index + 1) })
  }

  @JvmStatic
  fun main(args: Array<String>) {
    foldAndReduce()
  }
}