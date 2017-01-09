package 누구나쉽게배우는스칼라.ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_6_define_function_expression {
  def main(args: Array[String]): Unit = {
//    val g = f_
//    val g: (Int => Int) = f
    val g = f
    println(f(1))
  }

//  def f(i: Int) = i
  def f = (i: Int) => i
}
