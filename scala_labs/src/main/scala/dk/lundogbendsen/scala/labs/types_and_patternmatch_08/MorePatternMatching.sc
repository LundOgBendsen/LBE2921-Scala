
/**
 * Pattern matching from simple to complex, all exercises below are solved with pattern matching
 */
object MorePatternMatching {

  val stuff = "blue"                              //> stuff  : String = blue

  val myStuff  = stuff // ...                     //> myStuff  : String = blue
 //   case "red" ⇒ 1
  //  case "blue"..
  //  .. _ ⇒
//  }
//  assert(myStuff == 3)

//  def goldilocks(tuple: ... ) = tuple match {
 //   case ("porridge", "Papa") ⇒ "Papa eating porridge"
 //   case ("porridge", "Mama") ⇒ "Mama eating porridge"
 //   case ("porridge", "Baby") ⇒ "Baby eating porridge"
  //  case _ ⇒ "what?"
 // }

//  assert(goldilocks("porridge", "Mama") == "Mama eating porridge")

  /**
   * Pattern matching can wildcard parts of expressions:
   */
  // def goldilocks2 ...
  //  ...  _) ⇒ "eating"
  //  case ("chair", "Mama") ⇒ "sitting"
   // case _ ⇒ "what?"
  //}

  //assert(goldilocks2("porridge", "Goldilock") == "eating")
  //assert(goldilocks2("chair", "Mama") == "sitting")

  /**
   * Pattern matching can substitute parts of expressions:
   */
 // def goldilocksSub ...
  //  case ("porridge",...
  //    bear + ...
  //  +" said someone's been sitting in my chair"
 //  + " said someone's been sleeping in my bed"
 //   case _ ⇒ "what?"
  //}

  //assert(goldilocksSub("porridge", "Papa") == "Papa said someone's been eating my porridge")
  //assert(goldilocksSub("chair", "Mama") == "Mama said someone's been sitting in my chair")

  //  regularExpressionsPatternMatching

  val EatingRegularExpression = """Eating Alert: bear=([^,]+),\s+source=(.+)""".r //.r turns a String to a regular expression
                                                  //> EatingRegularExpression  : scala.util.matching.Regex = Eating Alert: bear=(
                                                  //| [^,]+),\s+source=(.+)
 // val SittingRegularExpression =

  //def goldilocksReg(expr: String) = expr match {
  //  case ... => "%s said someone's been eating my %s".format(bear, source)
 //   case ... "%s said someone's been sitting on my %s".format(bear, source)
  //  case _ => "what?"
 // }

//  assert(goldilocksReg("Eating Alert: bear=Papa, source=porridge") == "Papa said someone's been eating my porridge")
//  assert(goldilocksReg("Sitting Alert: bear=Mama, source=chair") == "Mama said someone's been sitting on my chair")

  // A backquote can be used to refer to a stable variable in scope to create a case statement, `foodItem`. Use the variable instead of string literal
  val foodItem = "porridge"                       //> foodItem  : String = porridge

  //def goldilocksVar ...
    //case  ...`foodItem` ...
    //case ("chair", "Mama") ⇒ "sitting"
    //case ("bed", "Baby") ⇒ "sleeping"
    //case _ ⇒ "what?"
  //}

 // assert(goldilocksVar("porridge", "Papa") == "eating")
 // assert(goldilocksVar("chair", "Mama") == "sitting")
 // assert(goldilocksVar("beer", "Cousin") == "what?")
  
  
  //use pattern matching to implement a partial function def, that is true if arguments are equal
//  def patternEquals(i: Int, j: Int) ...
    //  case ... true
     // case _   ⇒ false
    //}
  //  assert( patternEquals(3, 3) )
   // assert( !patternEquals(7, 9) )
   


  // pattern match against a `List` to select the 2 element
//    val secondElement = List(1, 2, 3) match ...
   //   ... ⇒ xs.head
   //   case _       ⇒ 0
  //  }

  //  assert( secondElement ==2)
    
  //  val secondElementStructural = List(1, 2, 3) match {
   //   ... ⇒ y
   //   case _            ⇒ 0
   // }
 //   assert( secondElementStructural == 2 )
    
}