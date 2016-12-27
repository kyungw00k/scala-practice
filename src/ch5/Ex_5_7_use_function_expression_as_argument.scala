package ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_7_use_function_expression_as_argument {

  def main(args: Array[String]): Unit = {
    println(calc(x => x + x, 1, 5))
  }

  def calc(f: Int => Int, start: Int, end: Int) = {

    def loop(index: Int, sum: Int): Int = {
      if (index > end)
        sum
      else
        loop(index+1, f(index)+sum)
    }

    loop(start, 0)
  }
}
