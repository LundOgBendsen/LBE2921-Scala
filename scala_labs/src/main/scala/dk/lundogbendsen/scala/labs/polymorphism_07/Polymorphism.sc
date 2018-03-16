package dk.lundogbendsen.scala.labs.polymorphism_07

object Polymorphism {
  val twoParams = List(1, 2)                      //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:284)
                                                  //| 	at dk.lundogbendsen.scala.labs.polymorphism_07.List$.apply(dk.lundogbend
                                                  //| sen.scala.labs.polymorphism_07.Polymorphism.scala:38)
                                                  //| 	at dk.lundogbendsen.scala.labs.polymorphism_07.Polymorphism$.$anonfun$ma
                                                  //| in$1(dk.lundogbendsen.scala.labs.polymorphism_07.Polymorphism.scala:4)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at dk.lundogbendsen.scala.labs.polymorphism_07.Polymorphism$.main(dk.lun
                                                  //| dogbendsen.scala.labs.polymorphism_07.Polymorphism.scala:3)
                                                  //| 	at dk.lundogbendsen.scala.labs.polymorphism_07.Polymorphism.main(dk.lund
                                                  //| ogbendsen.scala.labs.polymorphism_07.
                                                  //| Output exceeds cutoff limit.
  assert( twoParams.toString  == "1{2{.}}" )
  
    //uncomment to check an exception is thrown
  // Nil.head
}

// Discuss - when do we use a trait, and when do we use an abstract class?
trait List[T] {
    def isEmpty:Boolean
    def head: T
    def tail: List[T]
}
// Define a class to represent a non empty list
class Cons[T](val head:T, val tail: List[T]) extends List[T] {
   def isEmpty = ???
     override def toString() = head.toString +"{" + tail.toString + "}"
}

//define a class to represent the empty list
class Nil[T] extends List[T]{
  def isEmpty:Boolean = ???
  def head: Nothing = ???
  def tail: Nothing = ???
  override def toString() = "."
}




// a function for each accepted definition type
// the companion object, useful for creating instances of class
object List {
  // this is the secret juice, that let us use (arg) notation, ie List(1,2) = List.apply(1,2)
  def apply[T](x1: T, x2: T): List[T] = ???
}