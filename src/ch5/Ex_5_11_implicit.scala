package ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_11_implicit {
  implicit def doubleToInt(d: Double) = d.toInt

  def main(args: Array[String]): Unit = {

    // implicit은 그 단어 뜻처럼, 에러를 바로 내지 않고,
    // 해당하는 함수가 있으면 그것 을 사용해서 암묵적으로
    // 형 변환을 하도록 도와주어 함수의 활용도를 높이겠다는 뜻입니다.
    val x: Int = 18.0 // <- 원래는 type mismatch 에러남

    println(x)
  }
}
