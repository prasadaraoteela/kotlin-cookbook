package com.kotlin.cookbook.collection

/**
 * Created by Prasada Rao on 06/04/22 4:02 PM
 **/
fun main() {
  val objects = listOf("1", "2", "3", "4", "5", "6", "7")

  println(objects.chunked(3)) // [[1, 2, 3], [4, 5, 6], [7]]

  println(objects.chunked(3) { it.reversed() }) // [[3, 2, 1], [6, 5, 4], [7]]

  println(objects.windowed(3)) // [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6], [5, 6, 7]]

  println(objects.windowed(4, 2, true)) // [[1, 2, 3, 4], [3, 4, 5, 6], [5, 6, 7], [7]]

  println(objects.windowed(4, 2, true).flatten()) // [1, 2, 3, 4, 3, 4, 5, 6, 5, 6, 7, 7]

  println(listOf("abc", "def", "ghi").flatMap { it.toList() }) // [a, b, c, d, e, f, g, h, i]

  val languages = listOf("English", "Telugu", "Hindi")
  val languageCodes = listOf("EN", "TE", "HI")

  println(languages.zip(languageCodes)) // [(English, EN), (Telugu, TE), (Hindi, HI)]

  val random = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 4)

  println(random.zipWithNext()) // [(3, 1), (1, 4), (4, 1), (1, 5), (5, 9), (9, 2), (2, 6), (6, 5), (5, 4)]
  println(random.zipWithNext { a, b -> b - a }) // [-2, 3, -3, 4, 4, -7, 4, -1, -1]

  println(random.sum()) // 40
  println(random.average()) // 4.0

  println(random.reduce { accumulator, number -> accumulator * number }) // 129600
  println(random.fold(1) { accumulator, number -> accumulator * number }) // 129600
}