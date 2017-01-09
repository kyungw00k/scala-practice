package 누구나쉽게배우는스칼라.ch6

/**
  * Created by humphrey.park on 2016. 12. 28..
  */
object Ex_6_2 {

  case class Person(name: String, age: Int, rank: String)

  def main(args: Array[String]): Unit = {
    val person1 = Person("험프로", 36, "사원")
    val person2 = Person("손프로", 37, "사장")
    val person3 = Person("김프로", 38, "차장")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
  }

  def matchAndHi(person:Person ): Unit = person match {
    case Person("험프로", 36, "사원") => println("언능 앉아 일 좀 하지?")
    case Person("손프로", 37, "사장") => println("사장님 오셨습니다")
//    case Person("김프로", 38, "차장") => println("차장님 외근 가셔야요")
//    case Person("김프로", 38, "쏠로") => println("차장님 외근 가셔야요")
//    case Person("김프로", 38, _) => println("쏠로 왔어?")
//    case Person("김프로", 38, r) => println(s"${r} 왔어?")
    case Person(name, age, r) =>
      if ( age > 37 )
        println(s"${name}~ 장가기긴 글렀군")
      else
        println(s"${r} 왔어?")
  }
}
