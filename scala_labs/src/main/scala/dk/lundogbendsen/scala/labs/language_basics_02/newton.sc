package dk.lundogbendsen.scala.labs.language_basics_02

object newton {

	//implement a method, that finds the absolute value of a number
	def abs(x: Double) = ???                  //> abs: (x: Double)Nothing
	
	//assert( abs(-7) == 7)
	//assert( abs(3.9) == 3.9)
	
	// implement a method that improves the guess by finding the average between guess and x
	def improve(guess: Double, x: Double) = ???
                                                  //> improve: (guess: Double, x: Double)Nothing

	// implement a method, that checks if distance from x to guess squared is smaller than 0.001
  def isGoodEnough(guess: Double, x: Double) = ???//> isGoodEnough: (guess: Double, x: Double)Nothing
	

 
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  
	 def sqrt(x: Double) = sqrtIter(1.0, x)   //> sqrt: (x: Double)Double
	
  // check if sqrt(25) is close to 5
  //val of25 = sqrt(25)
  //assert(abs(of25*of25 - 25) < 0.001)

  
}