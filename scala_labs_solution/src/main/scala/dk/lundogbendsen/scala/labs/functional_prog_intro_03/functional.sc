package dk.lundogbendsen.scala.labs.functional_prog_intro_03

object functional {

// fibonacci:  fib(1) = 1, fib(2) = 1, fib(3)=fib(1)+fib(2)
def fib(n: Int): Int = {
  @annotation.tailrec
  def loop(n: Int, prev: Int, cur: Int): Int =
    if (n <= 0) prev
    else loop(n -1, cur, prev + cur)
  loop(n, 0, 1)
}                                                 //> fib: (n: Int)Int

// implement fib, so that the following expressions are true
 	fib(1)  ==1                               //> res0: Boolean = true
 	fib(5) ==5                                //> res1: Boolean = true
 	fib(6) == 8                               //> res2: Boolean = true


}