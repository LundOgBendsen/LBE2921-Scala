
object PatternMatching {
  val kitty = Cat("Simba", "Norwegian forest cast", true)
                                                  //> kitty  : Cat = Cat(Simba,Norwegian forest cast,true)
  val dog = Dog("Rex", true, true)                //> dog  : Dog = Dog(Rex,true,true)

  def petInfo(pet: Pet): String = pet match {
    case d: Dog => s"${d.name} says ${d bark}"
    case c: Cat => s"${c.name} says ${c meaow}"
    case _ => "Some pet"
  }                                               //> petInfo: (pet: Pet)String

  println(petInfo(kitty), petInfo(dog))           //> (Simba says Meaow, meaow,Rex says Wof-wof)
}

trait Pet
case class Cat(name: String, breed: String, purrrrrs: Boolean) extends Pet {
	def meaow() = "Meaow, meaow"
}
case class Dog(name: String, vaccinated: Boolean, dogSchool: Boolean) extends Pet {
  def bark() = "Wof-wof"
}