package BeginningScala.ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_9_default_argument_value {
  def main(args: Array[String]): Unit = {
    println(default())
  }

  def default(a: Int = 4, b: Int = 5): Int = a + b
}
