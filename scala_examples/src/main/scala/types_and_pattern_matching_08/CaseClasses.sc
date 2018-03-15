package types_and_pattern_matching_08

object CaseClasses {

  val odersky = Book("978-0981531649")            //> odersky  : types_and_pattern_matching_08.Book = Book(978-0981531649)
  //notice that parameters are public vals by default for case classes
  println(odersky.isbn13)                         //> 978-0981531649
 
 // equality by structure (deep equality), not object reference
  val libraryOdersky = Book("978-0981531649")     //> libraryOdersky  : types_and_pattern_matching_08.Book = Book(978-0981531649)
  assert( odersky == libraryOdersky )
  
}

case class Book(isbn13: String)