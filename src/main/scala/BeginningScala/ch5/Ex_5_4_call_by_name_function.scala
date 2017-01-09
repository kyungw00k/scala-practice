package BeginningScala.ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_4_call_by_name_function {
  def people(n: Int) = {
    println("수속 시작합니다~")
    n
  }

  def dropship(n: => Int) = {
    println("드랍십 준비~")
    println(n+"명 탑승요~")
  }

  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }
}

