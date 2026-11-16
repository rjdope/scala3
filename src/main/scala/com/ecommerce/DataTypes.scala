package com.ecommerce

object DataTypes extends App {
    val productId: Long = 10001L
    val productName: String = "Laptop"
    val price: BigDecimal = BigDecimal("75000.00")
    val quantity: Int = 2
    val available: Boolean = true
    val category: Char = 'E'

//    val totalPrice = price * quantity

    println(s"Product ID: $productId")
    println(s"Product Name: $productName")
    println(s"Price: ₹$price")
    println(s"Quantity: $quantity")
    println(s"Available: $available")
    println(s"Category: $category")
//    println(s"Total Price: ₹$totalPrice")

//    Complete these tasks:
//    1: Declare a customer name using String.
    val customerName: String = "Raja"
//    2: Declare customer age using Int.
    val customerAge: Int = 27
//    3: Declare account balance using BigDecimal.
    val accountBalance: BigDecimal = BigDecimal("800000.00")
//    4: Declare whether the customer is active using Boolean.
    val customerActive: Boolean = true
//    5: Declare the customer's initial using Char.
    val customerFirstChar: Char = 'R'
//    6: Calculate the total price of three products.
    val totalPrice: BigDecimal = price * quantity
    println(s"totalPrice: $totalPrice")
//    7: Convert an Int into a Double.
    val intToDouble = 277
    val finalCoveration = intToDouble.toDouble
    println(finalCoveration)

//    8: 1. Write a method that prints customer details and returns Unit.
    def customerDeatils(): Unit =
      println(customerName + " " + customerAge)

    customerDeatils()

}
