package ch6

/**
  * Created by humphrey.park on 2016. 12. 28..
  */
object Ex_6_3 {
  def main(args: Array[String]): Unit = {
    val num1 = "010-1234-5678"
    val num2 = "119"
    val num3 = "11A9"
    val num4 = "코드먹은똥개"

    val numList = List(num1, num2, num3, num4)

    for( number <- numList) {
      number match {
        case Emergency() => println("긴급전화입니다")
        case Normal(number) => println(s"일반전화입니다 ${number}")
        case _ => println("장난치지마셈")
      }
    }
  }
}

object Emergency {
  def unapply(arg: String): Boolean = {
    arg.length == 3 && arg.forall(_.isDigit)
  }
}

object Normal {
  def unapply(arg: String): Option[Int] = {
    try {
      var o = arg.replaceAll("-", "")
      Some(o.toInt)
    } catch {
      case _: Throwable => None
    }
  }
}
