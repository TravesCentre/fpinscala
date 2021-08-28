package ch2

object e23 extends App {
  def curry[A,B,C](f : (A,B) => C) : A => (B => C) = ( a : A) => ( b : B) => f(a,b)
  val v5 = curry[Integer,Double,String]( (a : Integer, b : Double) => a.toString+b.toString )(5)
  println(v5(0.5))
}
