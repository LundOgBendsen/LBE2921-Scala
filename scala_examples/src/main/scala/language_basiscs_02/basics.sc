package language_basiscs_02

object basics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val exp = if( 2 == 3) false else true           //> exp  : Boolean = true
  
  3 + 2 == 3.+(2)                                 //> res0: Boolean = true
  
  val getTheAnswer = () => 42                     //> getTheAnswer  : () => Int = language_basiscs_02.basics$$$Lambda$8/1277181601
                                                  //| @27f674d
  getTheAnswer() == 42                            //> res1: Boolean = true
  
  val list: List[Any] = List(
  "a string",
  732,  // an integer
  'c',  // a character
  true, // a boolean value
  () => "an anonymous function returning a string"
)                                                 //> list  : List[Any] = List(a string, 732, c, true, language_basiscs_02.basics$
                                                  //| $$Lambda$9/488970385@1a407d53)
  
  'a'.to('c')                                     //> res2: scala.collection.immutable.NumericRange.Inclusive[Char] = NumericRange
                                                  //|  a to c
}