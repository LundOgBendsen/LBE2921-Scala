package polymorphism

object IntList {

  val stack = new Stack[Int]                      //> stack  : polymorphism.Stack[Int] = polymorphism.Stack@3f8f9dd6
  stack.push(3)
  println(stack.pop)                              //> 3

}

class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A) { elements = x :: elements }
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}