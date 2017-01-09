package BeginningScala.ch6

/**
  * Created by humphrey.park on 2016. 12. 28..
  */
object Ex_6_1 {
  def main(args: Array[String]): Unit = {
    println(matchFunction(100))
    println(matchFunction(((i:Int) => i+i)))
    println(matchFunction(100))
  }

  def matchFunction(input:Any): Any = input match {
    case 100 => "hundred"
    case "hundred" => 100
    case etcNumber:Int => "입력값은 100이 아닌 정수입니다"
    case _ => "기타"
  }
}
