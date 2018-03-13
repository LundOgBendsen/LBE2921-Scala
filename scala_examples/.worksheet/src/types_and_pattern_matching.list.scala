package types_and_pattern_matching

import polymorphism._
// a function for each accepted definition type
object List {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(227); 
  //List(1,2) = List.apply(1,2)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil));System.out.println("""apply: [T](x1: T, x2: T)polymorphism.List[T]""")}
}

object use {
  List(1, 2)
}
