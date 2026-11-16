package com.ecommerce

object ValVarLazyVal extends App {
//  1: Declare a val called applicationName with value "E-Commerce".
  val applicationName = "E-Commerce"
//  2: Declare a var called totalOrders with initial value 100.
  var totalOrders = 100
//  3: Update totalOrders to 150.
  totalOrders = 150
//  4: Declare a lazy val called report that prints "Generating report..." and
//  returns "Order Report Ready".
  lazy val report = {
    println("Generating report")
    "Order Report Ready"
  }
//  5: Print all three values.
  println(applicationName)
  println(totalOrders)
//  6: Access report twice.
  println(report)
  println(report)



}
