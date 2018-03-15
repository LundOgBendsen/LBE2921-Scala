package dk.lundogbendsen.scala.labs.language_basics_02

object basics {
   // create an immutable variable
     val name = "Eva"                             //> name  : String = Eva
    //can you assign a new value to name?
    //val name = "Himansu"

    // create a mutable variable
    var country = "Denmark"                       //> country  : String = Denmark
    //reasign the mutable variable
    country = "Romania"
    
     // concatenate strings to "Current Address: Romania"
    val current = "Current Address: " + country   //> current  : String = Current Address: Romania
    
    //find length of current
    current.size                                  //> res0: Int = 24
    
    //find range of numbers from 1..10
    1.to(10)                                      //> res1: scala.collection.immutable.Range.Inclusive = Range 1 to 10
    
    //convert country to upper case
    country.toUpperCase                           //> res2: String = ROMANIA
    
    //drop the first letter in country
    country.drop(1)                               //> res3: String = omania
    
    def square(x: Double) = x * x                 //> square: (x: Double)Double
    
    //compute square of 2
    square(2)                                     //> res4: Double = 4.0
    
    // define a method that sums squares of two numbers, ie sumOfSquares(3,4) = 25
    def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
                                                  //> sumOfSquares: (x: Double, y: Double)Double
    
    sumOfSquares( 3,4) == 25                      //> res5: Boolean = true
    
    	//Uncomment to see a value that does not terminate
    //def loop: Int = loop
		//loop
		
		//define a method that computes the area of a triangle from height and width
		def triangleArea(base: Double, height: Double): Double = base*height /2
                                                  //> triangleArea: (base: Double, height: Double)Double
		
		triangleArea(1,2)                 //> res6: Double = 1.0
		
		// write the a method that finds an absolut value of an Int
		def abs(x: Int) = if (x >= 0) x else -x
                                                  //> abs: (x: Int)Int
                                                  
      	//create a list with at least 3 fruits
		val fruits = List( "apple", "pear", "banana")
                                                  //> fruits  : List[String] = List(apple, pear, banana)
		// find size of fruits
		fruits.size                       //> res7: Int = 3
                                                                   
		
		//how many letters are there in the alphabet
		'a'.to('z').length                //> res8: Int = 26
		
	                           
                                                                                      	
    
}