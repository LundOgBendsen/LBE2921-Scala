package dk.lundogbendsen.scala.labs.functional_prog_intro_03

object functional {

// implement a recursive function, that computes the fibonacci numbers:  fib(1) = 1, fib(2) = 1, fib(3)=fib(1)+fib(2)
def fib(n: Int): Int = {
  @annotation.tailrec
  def loop(n: Int, prev: Int, cur: Int): Int = ???
  //loop(n, 0, 1)
  0
}                                                 //> fib: (n: Int)Int

// implement fib, so that the following expressions are true
 	fib(1)  ==1                               //> res0: Boolean = false
 	fib(5) ==5                                //> res1: Boolean = false
 	fib(6) == 8                               //> res2: Boolean = false


}