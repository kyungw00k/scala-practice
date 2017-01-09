package BeginningAkka.ch2

import akka.actor._

class Ping extends Actor {
  val pong = context.actorOf(Props(new Pong(self)), "pong")

  def receive = {
    case message:String => {
      println(s"Ping received ${message}")
      pong ! "ping"
    }
  }
}

class Pong(ping: ActorRef) extends Actor {
  def receive = {
    case message:String => {
      println(s"Pong received ${message}")
      sender ! "pong"
      Thread.sleep(1000)
    }
  }
}

/**
  * Created by humphrey.park on 2017. 1. 9..
  */
object ex_2_1_akka_ping_pong {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("TestSystem")
    val ping = actorSystem.actorOf(Props[Ping], "ping")

    ping.tell("start", ActorRef.noSender)

  }
}
