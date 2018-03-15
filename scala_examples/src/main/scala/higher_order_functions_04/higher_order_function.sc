package hello

object higher_order_function {
  
  def sum(f: Int=>Int, a:Int, b:Int):Int = if(a>b) 0 else f(a) + sum(f, a+1,b)
                                                  //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  sum( (a) => a, 1, 4)                            //> res0: Int = 10
  
  sum( (a) => a*a, 1, 4)                          //> res1: Int = 30
}