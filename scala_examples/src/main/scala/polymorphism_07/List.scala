package polymorphism_07

// Discuss - when do we use a trait, and when do we use an abstract class?
trait List[T] {
    def isEmpty:Boolean
    def head: T
    def tail: List[T]
}

class Cons[T](val head:T, val tail: List[T]) extends List[T] {
   def isEmpty = false
     override def toString() = head.toString +"{" + tail.toString + "}"
}

class Nil[T] extends List[T]{
  def isEmpty:Boolean = true
  def head: Nothing = throw new NoSuchElementException("This is nil - no head")
  def tail: Nothing = throw new NoSuchElementException("This is nil - no tail")
  override def toString() = "."
}

object use  extends App{
  val twoParams = List(1, 2)
  println( twoParams)
}


// a function for each accepted definition type
// the companion object, useful for creating instances of class
object List {
  // this is the secret juice, that let us use (arg) notation, ie List(1,2) = List.apply(1,2)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
}

