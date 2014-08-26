package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0 || c==r) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def r(chars: List[Char], left: Int): Boolean = {
      if(left < 0) false
      if(chars.isEmpty && left == 0) true


      if(chars.head == '(') r(chars.tail, left+1)
      else if(chars.head == ')') r(chars.tail, left-1)
      else r(chars.tail, left)
    }
    r(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}