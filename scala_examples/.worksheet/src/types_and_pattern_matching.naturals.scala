package types_and_pattern_matching

object naturals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  val zero = Zero;System.out.println("""zero  : types_and_pattern_matching.Zero.type = """ + $show(zero ));$skip(27); 
  val one = Zero successor;System.out.println("""one  : types_and_pattern_matching.Succ = """ + $show(one ));$skip(26); 
  val two = one successor;System.out.println("""two  : types_and_pattern_matching.Succ = """ + $show(two ));$skip(21); 
  val four = two+two;System.out.println("""four  : types_and_pattern_matching.Nat = """ + $show(four ));$skip(26); val res$0 = 
  four - two - one == one;System.out.println("""res0: Boolean = """ + $show(res$0))}
}

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new IllegalStateException("Zero does not have predecessor!")
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat =
    if (that isZero) this
    else throw new IllegalArgumentException("This would give a negative number, " + this + " - " + that)
  override def toString = "_|_"
}

class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = n
  def +(that: Nat): Nat = new Succ(n + that)
  def -(that: Nat): Nat =
    if (that.isZero) this
    else n - that.predecessor
  override def toString = "." + predecessor.toString
}
