package polymorphism
import polymorphism._

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(153); 
  def nth[T](n: Int, xs: List[T]): T =
    if( xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: polymorphism.List[T])T""");$skip(60); 

	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : polymorphism.Cons[Int] = """ + $show(list ));$skip(14); val res$0 = 
	nth(2, list);System.out.println("""res0: Int = """ + $show(res$0))}
	//uncomment to see exception
	//nth(4, list)
}
