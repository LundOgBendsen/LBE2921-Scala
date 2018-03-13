package types_and_pattern_matching

import polymorphism._

object use {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  val twoParams = List(1, 2);System.out.println("""twoParams  : polymorphism.List[Int] = """ + $show(twoParams ))}
}


// a function for each accepted definition type
object List {
  //List(1,2) = List.apply(1,2)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
}
