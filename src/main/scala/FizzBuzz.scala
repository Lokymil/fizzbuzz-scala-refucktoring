package fr.arrestier

object FizzBuzz {
  /**
   * Translate any Int to String according to FizzBuzz rules :
   * - multiple of 3 = "fizz"
   * - multiple of 5 = "buzz"
   * - multiple of 3 & 5 = "fizzbuzz"
   * - not multiple of 3 or 5 = unchanged number as string
   *
   * @param value - number to be parsed according to fizzbuzz rules
   * @return parsed number
   */
  def fizzBuzz(value: Int): String = {
    var result = ""
    val isFizz = isMultipleOf3(value)
    val isBuzz = isMultipleOf5(value)

    if (isFizz) result += "fizz"

    if (isBuzz) result += "buzz"

    if (!isFizz && !isBuzz) result += value.toString

    result
  }

  /**
   * Test if given number is a multiple of 3
   *
   * @param value - number to test
   * @return true if value is multiple of 3, false otherwise
   */
  private def isMultipleOf3(value: Int): Boolean = value % 3 == 0

  /**
   * Test if given number is a multiple of 5
   *
   * @param value - number to test
   * @return true if value is multiple of 5, false otherwise
   */
  private def isMultipleOf5(value: Int): Boolean = value % 5 == 0
}
