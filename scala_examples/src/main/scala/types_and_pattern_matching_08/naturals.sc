package types_and_pattern_matching_08

object naturals {
  val one = Zero successor                        //> one  : types_and_pattern_matching_08.Succ = ._|_
  val two = one successor                         //> two  : types_and_pattern_matching_08.Succ = .._|_
  val four = two+two                              //> four  : types_and_pattern_matching_08.Nat = ...._|_
  four - two - one == one                         //> res0: Boolean = true
}

trait Nat {
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
  def apply(n:Int):Nat = this
}

class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = n
  def +(that: Nat): Nat = new Succ(n + that)
  def -(that: Nat): Nat =
    if (that.isZero) this
    else n - that.predecessor
  override def toString = "." + predecessor.toString
  def apply(m:Int):Nat = this(m)
 
}