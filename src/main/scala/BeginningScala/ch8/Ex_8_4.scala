package BeginningScala.ch8

object Ex_8_4 {
  def main(args: Array[String]): Unit = {
    val o = List(4, 3, 2, 1)
    val n = o.partition(i => i < 3) // unordered, sequential lookup

    println(n)
  }
}
