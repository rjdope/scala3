package com.ecommerce

object FunctionsAndMethods extends App {
  //   Instead of writing the same calculation repeatedly,
  //   you can create a reusable block of code. That reusable block is called a function.
  //  Basic function syntax in Scala 3
  /*
  * def functionName(parameters): returnType =
  *   // Function body
  * expression
  * */

  def add(a: Int, b: Int): Int =
    a + b

  val result = add(10, 20)
  println(result)

  //  1. Example: Return a String
  def getDetails(name: String, age: Int): String =
    s"name: $name, age: $age"

  println(getDetails("Raja", 27))

  //  2: Example: Return an Int
  def calcualte(name1: String, age1: Int): Int =
    age1 + name1.length

  println(calcualte("RJ", 27))

  //  3: Example: Return both Values
  def getDetailsAll(firstName: String, firstAge: Int): (String, Int) = (firstName, firstAge)

  println(getDetailsAll("RJ Dope", 28))

  //  4: Return different types conditionally
  def getValue(flag: Boolean): Any =
    if flag then "Hello" else 100

  println(getValue(true))

  //  Different types of methods
  def welcome(): String =
    "Welcome to scala 3"

  def test(): Unit =
    println(welcome())

  test()

  //  Method with parameters
  def geet(name: String): String =
    s"Hello $name"

  def testGeet(): Unit =
    println(geet("Raja"))

  testGeet()

  //  Method with multiple parameters
  def calculateTotal(price: Double, quantity: Int, discount: Double): Double =
    (price * quantity) - discount

  def testCalculeTotal(): Unit =
    println(calculateTotal(200.0, 4, 100.0))

  testCalculeTotal()

  //    Method without an explicit return type
  def add1(a: Int, b: Int) = // Scala infers that the return type is Int.
    a + b

  println(add1(25, 5))

  //    Method with a default parameter
  def createCustomer(name: String, country: String = "India"): String =
    s"$name from $country"

  println(createCustomer("RJ"))
  println(createCustomer("John", "USA"))

  //    Named arguments
  def createProduct(name: String, price: Double, quantity: Int): Unit =
    println(s"$name - $price - $quantity")

  def testCreateProduct(): Unit =
    createProduct(quantity = 20, name = "Raja", price = 300.0)

  testCreateProduct()

  //    Difference between a method and a function
  // Method defines as def
  def square(number: Int): Int =
    number * number

  // A function is an object/value that can be stored in a variable,
  // passed to another method, and returned from a method.
  val squareFunction: Int => Int =
    number => number * number

  // calling both method and function
  println(square(5))
  println(squareFunction(5))

  //    Anonymous functions (Lambda expressions)
  //    An anonymous function is a function without a declared name.
  val add2: (Int, Int) => Int =
    (a2, b2) => a2 + b2
  println(add2(10, 20))

  val add3 = (a3: Int, b3: Int, c3: Int) => a3 + b3 + c3
  println(add3(10, 20, 30))

  val price = List(100, 200, 300)
  val updatedPrice = price.map(price => price * 2)
  println(updatedPrice)

}
