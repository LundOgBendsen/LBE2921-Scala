package functional_prog_intro_03

object Functional {
  val numbers = 1 to 100
  numbers.filter( i=> i%10==0)
  numbers.filter( _%10 == 0)
  
}