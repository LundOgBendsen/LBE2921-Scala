package class_hierarchies

object class_hierarchies {

  val empty = Empty                               //> empty  : class_hierarchies.Empty.type = .
  val oneLeaf = new NonEmpty(5, Empty, Empty)     //> oneLeaf  : class_hierarchies.NonEmpty = (.,5,.)
  oneLeaf contains 5                              //> res0: Boolean = true
  oneLeaf contains 7                              //> res1: Boolean = false
  val twoLeaf = oneLeaf include 7                 //> twoLeaf  : class_hierarchies.IntSet = (.,5,(.,7,.))
  val threeLeaf = twoLeaf include 1               //> threeLeaf  : class_hierarchies.IntSet = ((.,1,.),5,(.,7,.))
  (oneLeaf include 42) union (threeLeaf include 17)
                                                  //> res2: class_hierarchies.IntSet = ((.,1,.),5,(.,7,(.,17,(.,42,.))))
  empty contains 1                                //> res3: Boolean = false
  oneLeaf contains 5
  
  
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