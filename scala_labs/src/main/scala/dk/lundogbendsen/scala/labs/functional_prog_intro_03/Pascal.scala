package dk.lundogbendsen.scala.labs.functional_prog_intro_03

/**
 * 
 * Print the following shape
 * 
 * 1 1 
 * 1 2 1 
 * 1 3 3 1 
 * 1 4 6 4 1 
 * 1 5 10 10 5 1 
 */

object Pascal {

  def pascal(c: Int, r: Int): Int = ???
                                              //> pascal: (c: Int, r: Int)Int

  def main(args: Array[String]) {

    println("Pascal's Triangle")
    for (row <- 0 to 5) {
      for (col <- 0 to row)
        // uncomment to print the shape
        // print(pascal(col, row) + " ")
      println()
    }
    println()
  }                                               //> main: (args: Array[String])Unit

}