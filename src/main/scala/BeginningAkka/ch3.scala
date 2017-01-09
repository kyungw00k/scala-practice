package BeginningAkka


import akka.actor._

/**
  * Created by humphrey.park on 2017. 1. 9..
  */
object ch3 {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("TestSystem")
    val ping = actorSystem.actorOf(Props[PingActor], "pingActor")

    ping ! "work"
  }
}


class PingActor extends Actor {
  val child = context.actorOf(Props[Ping1Actor], "ping1Actor")
  var count = 0

  def receive = {
    case "work" => child.!("work")(self)
    case "done" => {
      if (count == 0) {
        count += 1
      } else {
        println("all works are completed")
        count = 0
      }
    }
  }
}

class Ping1Actor extends Actor {
  val child1 = context.actorOf(Props[Ping2Actor], "ping2actor")
  val child2 = context.actorOf(Props[Ping3Actor], "ping3actor")

  def receive = {
    case "work" => {
      println("ping1 received message")
      child1.!("work")(sender)
      child2.!("work")(sender)
    }
  }
}

class Ping2Actor extends Actor {
  def receive = {
    case "work" => {
      println("ping2 received message")
      work

      sender ! "done"
    }
  }

  def work = {
    Thread.sleep(1000)
    println("ping2 working...")
  }
}

class Ping3Actor extends Actor {
  def receive = {
    case "work" => {
      println("ping3 received message")
      work
      sender ! "done"
    }
  }

  def work = {
    Thread.sleep(500)
    println("ping3 working...")
  }
}