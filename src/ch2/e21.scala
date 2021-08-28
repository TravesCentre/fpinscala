package ch2

import scala.annotation.tailrec

object e21 extends App {
  def fib(n : Integer) : Integer = {
    @tailrec
    def recurse(callsLeft : Integer,small : Integer, big : Integer) : Integer = {
      if(callsLeft == 0)
        small
      else
       recurse(callsLeft-1,big,small+big)
    }
    recurse(n-1,0,1)
  }
  def print(n: Integer ): Unit = if(n != 0) {
    println(fib(n))
    print(n-1)
  }

  print(10)
}
