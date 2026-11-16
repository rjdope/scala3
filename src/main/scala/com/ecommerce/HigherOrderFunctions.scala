package com.ecommerce

object HigherOrderFunctions extends App {
//  Higher-order functions
  /*
      A higher-order function is a function that:
        1. Accepts another function as a parameter, or
        2. Returns a function as its result.
  */

  def calculate(a: Int, b: Int, operation: (Int, Int) => Int): Int = operation(a, b)
  val addition = calculate(10, 20, (x, y) => x + y)
  val multiplication = calculate(10, 20, (x, y) => x * y)
  println(s"Addition: $addition")
  println(s"Multiplication: $multiplication")

}
