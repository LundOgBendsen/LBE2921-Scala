package hello

object higher_order_function {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(82); 
  
  def sum(f: Int=>Int, a:Int, b:Int):Int = if(a>b) 0 else f(a) + sum(f, a+1,b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(26); val res$0 = 
  
  sum( (a) => a, 1, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  
  sum( (a) => a*a, 1, 4);System.out.println("""res1: Int = """ + $show(res$1))}
}
