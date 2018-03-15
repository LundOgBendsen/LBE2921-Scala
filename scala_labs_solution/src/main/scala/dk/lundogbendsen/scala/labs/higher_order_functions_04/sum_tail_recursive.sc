package dk.lundogbendsen.scala.labs.higher_order_functions_04


object sum_tail_recursive {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  }
  
  sum( (i)=>i)(1, 4)
  
  sum( i => i*i)(3,4)

}