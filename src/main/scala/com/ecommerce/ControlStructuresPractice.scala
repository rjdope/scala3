package com.ecommerce

object ControlStructuresPractice extends App {
//  1: Check whether a customer is eligible for a discount.
  val customerAge  = 100
  val result = if customerAge  >= 18 then "Eligible for discount" else "Not eligible for discount"
  println(s"Customer Discount: $result")

//  2: Check whether a product is in stock.
  val stock = 3
  val productStock = if stock > 0 then s"Stock is there" else s"Stock Not there"
  println(s"Stock: $productStock")

//  3: Use match to identify an order status.
  val orderStatus = "PENDING"
  val status =
    orderStatus match
      case "SUCCESS" => s"SUCCESS"
      case "PENDING" => s"PENDING"
      case "SHIPPED" => s"SHIPPED"
      case _ => s"Not valid"
  println(s"Status: $status")

//   4: Print numbers from 1 to 20 using a for loop.
  for i <- 1 to 20 do
    println(s"Numbers: $i")

//   5: Print only even numbers from 1 to 50.
  val even = for
    j <- 1 to 50
    if j % 2 == 0
  yield j
  println(s"Even Numbers: $even")

//  6: Iterate through a list of product names.
  val products = List("Laptop", "Computer", "CPU")
  for product <- products do
    println(s"product")

//  7: Use a while loop to calculate the sum of numbers from 1 to 10.
  var count = 1
  var sum = 0
  while count <= 10 do
    sum += count
    count += 1
  println(s"sum of numbers from 1 to 10: $sum")

//  8: Use a for comprehension to double every number in a list.
  val doubleNumber = List(1, 2, 3, 4, 5)
  val everyNumber =
    for x <- doubleNumber
      yield x * 2
  println(s"Double Every Number in a List: $everyNumber")

}
