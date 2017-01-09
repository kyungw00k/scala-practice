package BeginningScala.ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_10_apply {
  def main(args: Array[String]): Unit = {
    val sth = new SomeClass

    println(sth(2))
    println(sth.apply(2))
    println(sth.method(2))
  }

  class SomeClass {
    def apply(m: Int) = method2(s"${m}")

    def method(i: Int) = i + i

    def method2(s: String) = s
  }

}
