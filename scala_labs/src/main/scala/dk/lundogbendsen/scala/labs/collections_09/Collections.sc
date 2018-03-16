package dk.lundogbendsen.scala.labs.collections_09

object Collections {
  val list = List("now", "is", "the", "time")     //> list  : List[String] = List(now, is, the, time)
  val names = Map(
    "Martin" -> "Odersky",
    "Joe" -> "Armstrong",
    "Simon" -> "Peyton Jones")                    //> names  : scala.collection.immutable.Map[String,String] = Map(Martin -> Oders
                                                  //| ky, Joe -> Armstrong, Simon -> Peyton Jones)

  //capitalize the elements
  val expected2 = list                            //> expected2  : List[String] = List(now, is, the, time)
  //assert( expected2 == List("NOW", "IS", "THE", "TIME"))

  // Return the first element
  val expected3 = list                            //> expected3  : List[String] = List(now, is, the, time)
  //assert(expected3 == "now")

  // Return the tail, all but the first element
  val expected4 = list                            //> expected4  : List[String] = List(now, is, the, time)
  //assert(expected4 == List("is", "the", "time"))

  // Return the last element
  val expected5 = list                            //> expected5  : List[String] = List(now, is, the, time)
  //assert( expected5 == "time")

  // Sort the elements by length
  val expected6 = list                            //> expected6  : List[String] = List(now, is, the, time)
  //assert(expected6 == List("is", "now", "the", "time"))

  // Return a tupple with two collections,
  // where one has the words that start with "t" and the other
  // collection has the rest of the words.
  val expected7 = list                            //> expected7  : List[String] = List(now, is, the, time)
  //assert( expected7 == Tuple2(List("the", "time"),List("now", "is")))

 // Return a collection of tupples (word, length)
   val expected8 = list                           //> expected8  : List[String] = List(now, is, the, time)
  //assert( expected8 == List(("now", 3), ("is", 2), ("the", 3), ("time", 4)))

  // Make a string from the list that matches the expected
  // string shown
  val expected9 = list                            //> expected9  : List[String] = List(now, is, the, time)
  //assert( expected9 == "[now-is-the-time]")

  // Map the "names" above to a 3-element list where each name ,"first last".
  // The anonymous function passed to map() can be written several ways. Note that
  // the anonymous function expects a Tuple2 argument for the key and value, OR
  // it can also be written as PartialFunction, which we'll discuss later:
  val expected10 = names                          //> expected10  : scala.collection.immutable.Map[String,String] = Map(Martin ->
                                                  //|  Odersky, Joe -> Armstrong, Simon -> Peyton Jones)
  //assert( expected10 == List("Martin Odersky", "Joe Armstrong", "Simon Peyton Jones"))

  // If you know SQL, you know the GROUP BY operation. Do the same thing using
  // a single Map API call to group by the numbers used as keys.
  val stuff = Map(1 -> "a", 2 -> "b", 1 -> "c", 3 -> "d", 2 -> "e")
                                                  //> stuff  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 -> e, 3
                                                  //|  -> d)
  val expected11 = stuff                          //> expected11  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 ->
                                                  //|  e, 3 -> d)

  /* assert( expected11 == Map(
  1 -> Map(1 -> "a", 1 -> "c"),
  2 -> Map(2 -> "b", 2 -> "e"),
  3 -> Map(3 -> "d")
))
*/

  // To anticipate the next section, note what happens when we retrieve
  // map elements:

  val expected12 = expected11                     //> expected12  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 ->
                                                  //|  e, 3 -> d)
  //assert( expected12 == Some(Map(1 -> "a", 1 -> "c")) )

  val expected13 = expected11                     //> expected13  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 ->
                                                  //|  e, 3 -> d)
  //assert( expected13 == None)

  val expected14 = expected11                     //> expected14  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 ->
                                                  //|  e, 3 -> d)
  //assert( expected14 == Map(4 -> "unknown"))

  import scala.collection.immutable.TreeSet

  // Extract all the unique characters (respecting case) into a list.
 // def uniques(args): List[Char] = ...
	
	val expected15 = List('N', 'T', 'e', 'h', 'i', 'm', 'o', 's', 't', 'w')
                                                  //> expected15  : List[Char] = List(N, T, e, h, i, m, o, s, t, w)
//	assert( uniques(List("Now", "is", "the", "Time")) == expected15)


}