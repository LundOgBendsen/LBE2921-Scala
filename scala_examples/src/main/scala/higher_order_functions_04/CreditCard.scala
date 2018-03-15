
/**
What we have is a list of credit cards and we’d like to calculate the premiums for all those cards,
 that the credit card company has to pay out.
The premiums themselves depend on the total number of credit cards, so that the company adjust them accordingly.
credit: https://lukajcb.github.io/blog/scala/2016/03/08/a-real-world-currying-example.html

*/


class CreditCard(val id: Int) {
	//note - string interpolation
  override def toString() = s"CC[$id]"}

object CreditCard {
	// note the 2 parameterlists
  def getPremium(totalCards: Int)(cc: CreditCard): Double = totalCards*cc.id/2018
}

object PremiumCalculator {
  val ccs = List.tabulate(7)(new CreditCard(_))
  val premium = CreditCard.getPremium(7)(ccs(0))
  //this curried function can be applied to a creditcard argument, and will return premium for that card
  // Discuss: what does the _ do?
  val getPremiumWithKnownTotal = CreditCard.getPremium(ccs.length)_
  val allPremiums = ccs.map(getPremiumWithKnownTotal).sum
  
}