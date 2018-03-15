package types_and_pattern_matching_08

object PatternMatching {
  val kitty = Cat("Simba", "Norwegian forest cast", true)
                                                  //> kitty  : types_and_pattern_matching_08.Cat = Cat(Simba,Norwegian forest cast
                                                  //| ,true)
  val dog = Dog("Rex", true, true)                //> dog  : types_and_pattern_matching_08.Dog = Dog(Rex,true,true)
  val coralSnake = Snake("misssssing", true, "Never open terrarium unsupervised", 28)
                                                  //> coralSnake  : types_and_pattern_matching_08.Snake = Snake(misssssing,true,Ne
                                                  //| ver open terrarium unsupervised,28)
  val snog = Snake("Snog", false, "Dont step on him", 15)
                                                  //> snog  : types_and_pattern_matching_08.Snake = Snake(Snog,false,Dont step on 
                                                  //| him,15)
  val myPonyHalfPart = Pony("Dark Queen", 2)      //> myPonyHalfPart  : types_and_pattern_matching_08.Pony = Pony(Dark Queen,2)

  val myPets = List(kitty, dog, coralSnake, snog, myPonyHalfPart)
                                                  //> myPets  : List[Product with Serializable with types_and_pattern_matching_08.
                                                  //| Pet] = List(Cat(Simba,Norwegian forest cast,true), Dog(Rex,true,true), Snake
                                                  //| (misssssing,true,Never open terrarium unsupervised,28), Snake(Snog,false,Don
                                                  //| t step on him,15), Pony(Dark Queen,2))

  def petInfo(pet: Pet): String = pet match {
    // match only if the snake is toxic
    // ...=> s"DANGER! TOXIC SNAKE, dont touch!!! ($n)"
    case Snake(n, _, _, _) => s"%n,  a harmless snake"
    case Pony(n, p) => s" <3<3<3 $n ... All bills shared in 1/$p"
      // match the dog and cat as variables, and return their names
   // case ... =>
    // case ... =>
    // match everything unmatched
    //c...  => "Some pet"
  }                                               //> petInfo: (pet: types_and_pattern_matching_08.Pet)String

  // print petinfo
  //  myPets. ...
}

trait Pet
case class Cat(name: String, breed: String, purrrrrs: Boolean) extends Pet
case class Dog(name: String, vaccinated: Boolean, dogSchool: Boolean) extends Pet
case class Snake(name: String, toxic: Boolean, instructions: String, minimalTemperature: Int) extends Pet
case class Pony(name: String, coOwners: Int) extends Pet