package ch2

import scala.annotation.tailrec

object e22 extends App {
 def isSorted[A](as : Array[A],ordered : (A,A) => Boolean ) : Boolean = {
   @tailrec
   def loop ( ind : Integer) : Boolean = {
     if(ind +1 >= as.size)
       true
     else if(! ordered(as(ind),as(ind+1)))
       false
     else
       loop(ind+1)
   }
  loop(0)
 }
  println(isSorted[Integer](Array(1,2,3,4,5,6,7),(a : Integer,b : Integer) => a <= b))
  println(isSorted[Integer](Array(1,2,3,4,5,6,7),(a : Integer,b : Integer) => a >= b))
}
