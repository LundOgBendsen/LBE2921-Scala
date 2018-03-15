package dk.lundogbendsen.scala.labs.objects_and_data_05

object Rational {
// Check that you can create a rational
//  val x = new Rational(1,3)
 
 //Create fields, numerator and denominator. Check that you can access the fields
  //x.numerator
 // x.denominator
  
  //Check that you can add
  //val z = new Rational(1,2)
  //val y = x.add(z)
  
  // Check that you can use negate
  // val negy = y.negative
  
  // check that result is correct
  // val res = negy add(z) add(x)
  
  //Check that you can substract
  //y.substract(z)
  
  //check that smalle than is correct
  //x < z
  
  // check that max is correct
  // x.max(z)
  
  //uncomment to see precondition error!
  //val strange = new Rational(1,0)
 // strange.add(strange)
 
 // check that unary constructor works
 //val integer = new Rational(1)
  
  
}

class Rational(x: Int, y: Int) {
//Fail early
	require( y!= 0, "Only non zero values for denominator accepted")
//greatestCommonDenominator
  private def gcd(a: Int, b:Int):Int = if(b==0)a else gcd(b, a%b)
  
	 //val numerator =
	 
 	// Implement unary constructor
  //def this ...
  
  def add( that: Rational): Rational = ???
  
  def negative():Rational = ???
  
  def substract(that:Rational):Rational = ???
  
  def <(that:Rational):Boolean = ???
  
  def max(that: Rational): Rational = ???
  
  override def toString() = ???
}