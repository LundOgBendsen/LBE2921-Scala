
/**
 * Pattern matching from simple to complex, all exercises below are solved with pattern matching
 */
object MorePatternMatching {

  val stuff = "blue"                              //> stuff  : String = blue

  val myStuff = stuff match {
    case "red" ⇒ 1
    case "blue" ⇒ 3
    case _ ⇒
      println(stuff); // case _ will trigger if all other cases fail.
  }                                               //> myStuff  : AnyVal = 3
  assert(myStuff == 3)

  def goldilocks(tuple: (String, String)) = tuple match {
    case ("porridge", "Papa") ⇒ "Papa eating porridge"
    case ("porridge", "Mama") ⇒ "Mama eating porridge"
    case ("porridge", "Baby") ⇒ "Baby eating porridge"
    case _ ⇒ "what?"
  }                                               //> goldilocks: (tuple: (String, String))String

  assert(goldilocks("porridge", "Mama") == "Mama eating porridge")

  /**
   * Pattern matching can wildcard parts of expressions:
   */
  def goldilocks2(tuple: (String, String)) = tuple match {
    case ("porridge", _) ⇒ "eating"
    case ("chair", "Mama") ⇒ "sitting"
    case ("bed", "Baby") ⇒ "sleeping"
    case _ ⇒ "what?"
  }                                               //> goldilocks2: (tuple: (String, String))String

  assert(goldilocks2("porridge", "Goldilock") == "eating")
  assert(goldilocks2("chair", "Mama") == "sitting")

  /**
   * Pattern matching can substitute parts of expressions:
   */
  def goldilocksSub(tuple: (String, String)) = tuple match {
    case ("porridge", bear) ⇒
      bear + " said someone's been eating my porridge"
    case ("chair", bear) ⇒ bear + " said someone's been sitting in my chair"
    case ("bed", bear) ⇒ bear + " said someone's been sleeping in my bed"
    case _ ⇒ "what?"
  }                                               //> goldilocksSub: (tuple: (String, String))String

  assert(goldilocksSub("porridge", "Papa") == "Papa said someone's been eating my porridge")
  assert(goldilocksSub("chair", "Mama") == "Mama said someone's been sitting in my chair")

  //  regularExpressionsPatternMatching

  val EatingRegularExpression = """Eating Alert: bear=([^,]+),\s+source=(.+)""".r //.r turns a String to a regular expression
                                                  //> EatingRegularExpression  : scala.util.matching.Regex = Eating Alert: bear=(
                                                  //| [^,]+),\s+source=(.+)
  val SittingRegularExpression =
    """Sitting Alert: bear=([^,]+),\s+source=(.+)""".r
                                                  //> SittingRegularExpression  : scala.util.matching.Regex = Sitting Alert: bear
                                                  //| =([^,]+),\s+source=(.+)
  val SleepingRegularExpression = """Sleeping Alert: bear=([^,]+),\s+source=(.+)""".r
                                                  //> SleepingRegularExpression  : scala.util.matching.Regex = Sleeping Alert: be
                                                  //| ar=([^,]+),\s+source=(.+)

  def goldilocksReg(expr: String) = expr match {
    case (EatingRegularExpression(bear, source)) => "%s said someone's been eating my %s".format(bear, source)
    case (SittingRegularExpression(bear, source)) => "%s said someone's been sitting on my %s".format(bear, source)
    case (SleepingRegularExpression(bear, source)) => "%s said someone's been sleeping in my %s".format(bear, source)
    case _ => "what?"
  }                                               //> goldilocksReg: (expr: String)String

  assert(goldilocksReg("Eating Alert: bear=Papa, source=porridge") == "Papa said someone's been eating my porridge")
  assert(goldilocksReg("Sitting Alert: bear=Mama, source=chair") == "Mama said someone's been sitting on my chair")

  // A backquote can be used to refer to a stable variable in scope to create a case statement, `foodItem`. Use the variable instead of string literal
  val foodItem = "porridge"                       //> foodItem  : String = porridge

  def goldilocksVar(expr: Any) = expr match {
    case (`foodItem`, _) ⇒ "eating"
    case ("chair", "Mama") ⇒ "sitting"
    case ("bed", "Baby") ⇒ "sleeping"
    case _ ⇒ "what?"
  }                                               //> goldilocksVar: (expr: Any)String

  assert(goldilocksVar("porridge", "Papa") == "eating")
  assert(goldilocksVar("chair", "Mama") == "sitting")
  assert(goldilocksVar("beer", "Cousin") == "what?")
  
  def patternEquals(i: Int, j: Int) = j match {
      case `i` ⇒ true
      case _   ⇒ false
    }                                             //> patternEquals: (i: Int, j: Int)Boolean
    assert( patternEquals(3, 3) )
    assert( !patternEquals(7, 9) )
   


  // pattern match against a `List`
    val secondElement = List(1, 2, 3) match {
      case x :: xs ⇒ xs.head
      case _       ⇒ 0
    }                                             //> secondElement  : Int = 2

    assert( secondElement ==2)
    
    val secondElementStructural = List(1, 2, 3) match {
      case x :: y :: xs ⇒ y
      case _            ⇒ 0
    }                                             //> secondElementStructural  : Int = 2
    assert( secondElementStructural == 2 )
    
    
}