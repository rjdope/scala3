package com.ecommerce

import scala.annotation.tailrec

object FunctionsAndMethodsProblems extends App {
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

//  Recursive functions
  def factorial(n: Int): BigInt =
    if n <= 1 then
      BigInt(1)
    else n * factorial(n - 1)
  println(s"Factorial of : ${factorial(2)}")

//  Tail-recursive functions
  def tailFactorial(n: Int): BigInt =
    @tailrec
    def loop(current: Int, accumulator: BigInt): BigInt =
      if current <= 1 then
        accumulator
      else loop(current - 1, accumulator * current)
    loop(n, BigInt(1))

  println(s"tailFactorial of: ${tailFactorial(5)}")

  /*
      Why use @tailrec?
        - The compiler verifies that the recursive call is in tail position.
        - The compiler can optimize valid tail recursion into iteration.
        - It helps avoid stack overflow for large recursive computations.
  */

//  Methods with multiple parameter lists
//  This feature is useful for currying and partial application.
  def calculateDiscount(price: Double)
                       (discountPrecentage: Double): Double =
    price * discountPrecentage / 100

  println(calculateDiscount(1000.0)(10.0))

//  Functions in your E-Commerce project
  def calculateTotal(price: BigDecimal, quantity: Int): BigDecimal =
    price * quantity
  def calculateDiscount(total: BigDecimal, percentage: BigDecimal): BigDecimal =
    total * percentage / 100
  def validateQuantity(quantity: Int): Boolean =
    quantity > 0
  def printOrder(orderId: String): Unit =
    println(s"Processing order: $orderId")

  val price = BigDecimal("10000.00")
  val quantity = 3

  if FunctionsAndMethodsProblems.validateQuantity(quantity) then
    val total = FunctionsAndMethodsProblems.calculateTotal(price, quantity)
    val discount = FunctionsAndMethodsProblems.calculateDiscount(total, BigDecimal(10))
    println(s"Total: $total")
    println(s"Discount: $discount")
    println(s"Final amount: ${total - discount}")



}
