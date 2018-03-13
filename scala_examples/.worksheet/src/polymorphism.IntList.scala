package polymorphism

object IntList {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 

  val stack = new Stack[Int];System.out.println("""stack  : polymorphism.Stack[Int] = """ + $show(stack ));$skip(16); 
  stack.push(3);$skip(21); 
  println(stack.pop)}

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
