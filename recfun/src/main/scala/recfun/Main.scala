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
    def dfs(str: List[Char], left: Int): Boolean = {
      if(left < 0) false
      else if(str.isEmpty) {
        left == 0
      }
      else {
        if (str.head == '(') dfs(str.tail, left + 1)
        else if (str.head == ')') dfs(str.tail, left - 1)
        else dfs(str.tail, left)
      }
    }
    dfs(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
