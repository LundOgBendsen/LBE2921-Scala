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
      case _             ⇒ 0
    }                                             //> r  : Int = 0
    
     val q = List(1, 2, 3) match {
      case x :: y :: z :: tail ⇒ tail
      case _                   ⇒ 0
    }                                             //> q  : Any = List()
}