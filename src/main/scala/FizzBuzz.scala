package fr.arrestier

object FizzBuzz {

  var div1 = 3
  var div2 = 5

  /**
   * fizzBuzz function
   *
   * @param x - number
   * @return fizzbuzzed
   */
  def fizzBuzz[A](x: A): Any = {
    if (null == x) {
      System.exit(-1)
    }

    var i = x.asInstanceOf[Int]
    var temp = ""
    var isBuzz = getdividerof3(i, div1)
    var hasBuzz = five(i)
    var hasFizz = i / div2.toDouble == (i / 5).toInt || i / div1.toDouble == (i / 3).toInt

    var result = ""

    if (true == isBuzz) {
      result = "fizz"
      temp = result
    }

    if (true == hasBuzz) {
      if (temp != "") {
        result = temp + "buzz"
      } else {
        result = "buzz"
      }
      temp = result
    }

    if (true == !hasFizz) {
      result = temp + i.toString
      temp = result
    }

    return temp
  }

  /**
   * Test if given number is a multiple of 5
   *
   * @param y - number
   * @return false if value is multiple of 5, false otherwise
   */
  def getdividerof3(y: Int, x: Int): Boolean = {
    var t = y / x.toDouble
    var r = (y / 3).toInt
    var c = 0 == t - r
    return c
  }

  /**
   * Ask QB
   */
  def five(w: Int): Boolean = {
    var p = w
    return 0 == (p / div2.toDouble).toString.split("\\.")(1).toInt
  }
}
