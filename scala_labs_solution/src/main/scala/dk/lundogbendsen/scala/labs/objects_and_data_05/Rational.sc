package objects_and_data_05

object Rational {
  val x = new Rational(1,3)                       //> x  : objects_and_data_05.Rational = 1/3
  //x.numerator
 // x.denominator
  
  val z = new Rational(1,2)                       //> z  : objects_and_data_05.Rational = 1/2
  
  val y = x.add(z)                                //> y  : objects_and_data_05.Rational = 5/6
  
  val negy = y.negative                           //> negy  : objects_and_data_05.Rational = -5/6
  
  val res = negy add(z) add(x)                    //> res  : objects_and_data_05.Rational = 0/1
  
  y.substract(z)                                  //> res0: objects_and_data_05.Rational = 1/3
  
  x < z                                           //> res1: Boolean = true
  
  x.max(z)                                        //> res2: objects_and_data_05.Rational = 1/2
  
  //uncomment to see precondition error!
  //val strange = new Rational(1,0)
 // strange.add(strange)
 
 val integer = new Rational(1)                    //> integer  : objects_and_data_05.Rational = 1/1
  
  
}

class Rational(x: Int, y: Int) {
//Fail early
	require( y!= 0, "Only non zero values for denominator accepted")
//greatestCommonDenominator
  private def gcd(a: Int, b:Int):Int = if(b==0)a else gcd(b, a%b)
  
	val g = gcd(x,y)
  val numerator = x/g
  val denominator = y/g
  
  def this(x:Int) = this(x,1)
  
  
  def add( that: Rational): Rational = {
  	 	 new Rational( numerator*that.denominator + that.numerator*denominator, denominator*that.denominator)
  }
  
  def negative():Rational = new Rational( -numerator, denominator)
  
  def substract(that:Rational):Rational = add(that.negative)
  
  def <(that:Rational):Boolean = numerator*that.denominator < that.numerator*denominator
  
  def max(that: Rational): Rational = if(this<that) that else this
  
  override def toString() = numerator + "/" + denominator
}