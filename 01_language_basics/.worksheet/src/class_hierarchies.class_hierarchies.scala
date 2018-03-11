package class_hierarchies

object class_hierarchies {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 

  val empty = Empty;System.out.println("""empty  : class_hierarchies.Empty.type = """ + $show(empty ));$skip(46); 
  val oneLeaf = new NonEmpty(5, Empty, Empty);System.out.println("""oneLeaf  : class_hierarchies.NonEmpty = """ + $show(oneLeaf ));$skip(21); val res$0 = 
  oneLeaf contains 5;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(21); val res$1 = 
  oneLeaf contains 7;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(34); 
  val twoLeaf = oneLeaf include 7;System.out.println("""twoLeaf  : class_hierarchies.IntSet = """ + $show(twoLeaf ));$skip(36); 
  val threeLeaf = twoLeaf include 1;System.out.println("""threeLeaf  : class_hierarchies.IntSet = """ + $show(threeLeaf ));$skip(52); val res$2 = 
  (oneLeaf include 42) union (threeLeaf include 17);System.out.println("""res2: class_hierarchies.IntSet = """ + $show(res$2));$skip(19); val res$3 = 
  empty contains 1;System.out.println("""res3: Boolean = """ + $show(res$3))}
  
  
}

abstract class IntSet {
  def contains(n: Int): Boolean
  def include(n: Int): IntSet
  def union( other: IntSet): IntSet
}

object Empty extends IntSet {
  def contains(n: Int) = false
  def include(n: Int) = new NonEmpty(n, Empty, Empty)
  def union( other: IntSet):IntSet = other
  override def toString() = "."
}

class NonEmpty(x: Int, left: IntSet, right: IntSet) extends IntSet {
	def contains(n: Int):Boolean =
		if(n < x) left contains n
		else if(n>x) right contains n
		else true
		
  def include(n: Int): IntSet =
  		if(n<x) new NonEmpty(x, left include n, right)
  		else if(n>x) new NonEmpty(x, left, right include n)
  		else this
  		
  def union( other: IntSet):IntSet = ((left union right) union other) include x
  
  override def toString() = "("+ left + ","+ x +","+ right +")"
}
