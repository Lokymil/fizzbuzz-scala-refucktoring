package fr.arrestier

import org.scalatest.flatspec.AnyFlatSpec

class FizzBuzzTest extends AnyFlatSpec {
  "fizzBuzz function" should "return \"1\" when given 1" in {
    assert(FizzBuzz.fizzBuzz(1) == "1")
  }

  it should "return \"2\" when given 2" in {
    assert(FizzBuzz.fizzBuzz(2) == "2")
  }

  it should "return \"4\" when given 4" in {
    assert(FizzBuzz.fizzBuzz(4) == "4")
  }

  it should "return \"fizz\" when given a multiple of 3 (-> 3)" in {
    assert(FizzBuzz.fizzBuzz(3) == "fizz")
  }

  it should "return \"fizz\" when given a multiple of 3 (-> 6)" in {
    assert(FizzBuzz.fizzBuzz(6) == "fizz")
  }

  it should "return \"fizz\" when given a multiple of 3 (-> 9)" in {
    assert(FizzBuzz.fizzBuzz(9) == "fizz")
  }

  it should "return \"buzz\" when given a multiple of 5 (-> 5)" in {
    assert(FizzBuzz.fizzBuzz(5) == "buzz")
  }

  it should "return \"buzz\" when given a multiple of 5 (-> 10)" in {
    assert(FizzBuzz.fizzBuzz(10) == "buzz")
  }

  it should "return \"buzz\" when given a multiple of 5 (-> 20)" in {
    assert(FizzBuzz.fizzBuzz(20) == "buzz")
  }

  it should "return \"fizzbuzz\" when given a multiple of 3 & 5 (-> 15)" in {
    assert(FizzBuzz.fizzBuzz(15) == "fizzbuzz")
  }

  it should "return \"fizzbuzz\" when given a multiple of 3 & 5 (-> 30)" in {
    assert(FizzBuzz.fizzBuzz(30) == "fizzbuzz")
  }

  it should "return \"fizzbuzz\" when given a multiple of 3 & 5 (-> 45)" in {
    assert(FizzBuzz.fizzBuzz(45) == "fizzbuzz")
  }
}
