package types_and_pattern_matching_08

import scala.util.Random


object Match {

//first time we see match
  def isHowMany( n: Int):String = n match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }                                               //> isHowMany: (n: Int)String
  
   val x: Int = Random.nextInt(10)                //> x  : Int = 4
   val says =  isHowMany(x)                       //> says  : String = many
 
  // appreciate how many unicorns were saved here
   (1 to 9).map( Random.nextInt ).map( isHowMany ).foreach( println )
                                                  //> zero
                                                  //| one
                                                  //| two
                                                  //| two
                                                  //| zero
                                                  //| many
                                                  //| zero
                                                  //| many
                                                  //| many
  
}