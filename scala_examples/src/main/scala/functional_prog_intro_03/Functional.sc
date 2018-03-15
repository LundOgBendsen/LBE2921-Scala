package functional_prog_intro_03

object Functional {
  val numbers = 1 to 100                          //> numbers  : scala.collection.immutable.Range.Inclusive = Range 1 to 100
  numbers.filter( i=> i%10==0)                    //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(10, 20, 30, 40, 50
                                                  //| , 60, 70, 80, 90, 100)
  numbers.filter( _%10 == 0)                      //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(10, 20, 30, 40, 50
                                                  //| , 60, 70, 80, 90, 100)
  
}