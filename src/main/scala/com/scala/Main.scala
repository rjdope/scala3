package com.scala

@main
def startApplication(): Unit = {
//  val — Immutable variable
//  syntax: val variableName = value
  val name = "Raja"
  val age = 27
//  val name = "RJ" // cannot reassign that variable to another value.

//  var — Mutable variable
//  Syntax: var variableName = value
  var personAge = 26
  personAge = 27
//  var is used when you want to change the value associated with a variable.

//  lazy val — Lazy initialization
//  Syntax: lazy val variableName = expression
  lazy val message = {
    println("First Message")
    "Welcome to scala 3"
  }

  println("Application Started")
  println(message)
  println(message)
//  A lazy val is initialized only when it is accessed for the first time.

}

