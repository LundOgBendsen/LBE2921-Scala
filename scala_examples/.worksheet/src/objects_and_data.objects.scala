package objects_and_data

object objects {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  val x = new Rational(1,3);System.out.println("""x  : objects_and_data.Rational = """ + $show(x ));$skip(65); 
  //x.numerator
 // x.denominator
  
  val z = new Rational(1,2);System.out.println("""z  : objects_and_data.Rational = """ + $show(z ));$skip(22); 
  
  val y = x.add(z);System.out.println("""y  : objects_and_data.Rational = """ + $show(y ));$skip(27); 
  
  val negy = y.negative;System.out.println("""negy  : objects_and_data.Rational = """ + $show(negy ));$skip(34); 
  
  val res = negy add(z) add(x);System.out.println("""res  : objects_and_data.Rational = """ + $show(res ));$skip(20); val res$0 = 
  
  y.substract(z);System.out.println("""res0: objects_and_data.Rational = """ + $show(res$0));$skip(11); val res$1 = 
  
  x < z;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(14); val res$2 = 
  
  x.max(z);System.out.println("""res2: objects_and_data.Rational = """ + $show(res$2));$skip(138); 
  
  //uncomment to see precondition error!
  //val strange = new Rational(1,0)
 // strange.add(strange)
 
 val integer = new Rational(1);System.out.println("""integer  : objects_and_data.Rational = """ + $show(integer ))}
  
  
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
