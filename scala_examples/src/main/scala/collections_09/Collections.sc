package collections_09

object Collections {

  val numbersArray = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
                                                  //> numbersArray  : Array[Int] = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
  numbersArray(1) = 42

  val numbers = List(5, 4, 8, 6, 2)               //> numbers  : List[Int] = List(5, 4, 8, 6, 2)
  numbers.fold(0) { (z, i) => z + i }             //> res0: Int = 25

  val listOperator = numbers.tail.head            //> listOperator  : Int = 4

  val nums = 1 :: (2 :: (3 :: Nil))               //> nums  : List[Int] = List(1, 2, 3)

  val r = List(1, 2, 3) match {
    case x :: y :: Nil ⇒ y // only matches a list with exactly two items
    case _ ⇒ 0
  }                                               //> r  : Int = 0

  val q = List(1, 2, 3) match {
    case x :: y :: z :: tail ⇒ tail
    case _ ⇒ 0
  }                                               //> q  : Any = List()

// example of for-comprehension with
  val filesHere = (new java.io.File(".")).listFiles
                                                  //> filesHere  : Array[java.io.File] = Array(./eclipse, ./hs_err_pid3653.log)
  for (file <- filesHere) println(file)           //> ./eclipse
                                                  //| ./hs_err_pid3653.log

  for (file <- filesHere if file.getName.endsWith("./eclipse"))
    println(file)
    
    import scala.io.Source
  //multiple generators, multiple loops
   def grep(pattern: String) =
      for (
        file <- filesHere
        if file.getName.endsWith(".scala");
        line <- Source.fromFile(file).getLines
        if line.trim.matches(pattern)
      ) println(file + ": " + line.trim)          //> grep: (pattern: String)Unit
  
    grep(".*Collection.*")
}