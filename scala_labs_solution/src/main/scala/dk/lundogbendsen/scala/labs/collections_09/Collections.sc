package dk.lundogbendsen.scala.labs.collections_09

object Collections {
  val list = List("now", "is", "the", "time")     //> list  : List[String] = List(now, is, the, time)
  val names = Map(
    "Martin" -> "Odersky",
    "Joe" -> "Armstrong",
    "Simon" -> "Peyton Jones")                    //> names  : scala.collection.immutable.Map[String,String] = Map(Martin -> Oders
                                                  //| ky, Joe -> Armstrong, Simon -> Peyton Jones)

  //capitalize the elements
  val expected2 = list map (_.toUpperCase)        //> expected2  : List[String] = List(NOW, IS, THE, TIME)
  assert( expected2 == List("NOW", "IS", "THE", "TIME"))

  // Return the first element
  val expected3 = list.head                       //> expected3  : String = now
  assert(expected3 == "now")

  // Return the tail of the list
  val expected4 = list.tail                       //> expected4  : List[String] = List(is, the, time)
  assert(expected4 == List("is", "the", "time"))

  // Return the last element
  val expected5 = list.last                       //> expected5  : String = time
  assert( expected5 == "time")

  // Sort the elements by length
  val expected6 = list sortBy (_.length)          //> expected6  : List[String] = List(is, now, the, time)
  assert(expected6 == List("is", "now", "the", "time"))

 // Return a tupple with two collections,
  // where one has the words that start with "t" and the other
  // collection has the rest of the words.
  val expected7 = list partition (_(0) == 't')    //> expected7  : (List[String], List[String]) = (List(the, time),List(now, is))
  assert( expected7 == Tuple2(List("the", "time"),List("now", "is")))

  // Return a collection of tupples (word, length)
  val expected8 = list zip (list map (_.length))  //> expected8  : List[(String, Int)] = List((now,3), (is,2), (the,3), (time,4))
                                                  //| 
  assert( expected8 == List(("now", 3), ("is", 2), ("the", 3), ("time", 4)))

  // Make a string from the list that matches the expected
  val expected9 = list mkString ("[", "-", "]")   //> expected9  : String = [now-is-the-time]
  assert( expected9 == "[now-is-the-time]")

  // Map the "names" above to a 3-element list where each name , is in the format "first last"
  val expected10 = names map { case (key, value) => s"$key $value" }
                                                  //> expected10  : scala.collection.immutable.Iterable[String] = List(Martin Ode
                                                  //| rsky, Joe Armstrong, Simon Peyton Jones)
  assert( expected10 == List("Martin Odersky", "Joe Armstrong", "Simon Peyton Jones"))

  // If you know SQL, you know the GROUP BY operation. Do the same thing using
  // a single Map API call to group by the numbers used as keys.
  val stuff = Map(1 -> "a", 2 -> "b", 1 -> "c", 3 -> "d", 2 -> "e")
                                                  //> stuff  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 -> e, 3
                                                  //|  -> d)
  val expected11 = stuff groupBy { case (key, value) => key }
                                                  //> expected11  : scala.collection.immutable.Map[Int,scala.collection.immutable
                                                  //| .Map[Int,String]] = Map(2 -> Map(2 -> e), 1 -> Map(1 -> c), 3 -> Map(3 -> d
                                                  //| ))


   assert( expected11 == Map(
  1 -> Map(1 -> "a", 1 -> "c"),
  2 -> Map(2 -> "b", 2 -> "e"),
  3 -> Map(3 -> "d")
))

  // which element from the map do you have to retrieve to match the next assertion ? (Note the Some)
  val expected12 = expected11.get(1)              //> expected12  : Option[scala.collection.immutable.Map[Int,String]] = Some(Map
                                                  //| (1 -> c))
	assert( expected12 == Some(Map(1 -> "a", 1 -> "c")) )

//which retrieval matches this assertion?
  val expected13 = expected11.get(0)              //> expected13  : Option[scala.collection.immutable.Map[Int,String]] = None
  assert( expected13 == None)

//match the next assertion with a single call to the map api
  val expected14 = expected11.getOrElse(4, Map(4 -> "unknown"))
                                                  //> expected14  : scala.collection.immutable.Map[Int,String] = Map(4 -> unknown
                                                  //| )
assert( expected14 == Map(4 -> "unknown"))

  // Extract all the unique characters (respecting case) into a list.
  val uniques = List("Now", "is", "the", "Time").flatMap(_.toList).toSet.toList.sortWith( _ < _)
                                                  //> uniques  : List[Char] = List(N, T, e, h, i, m, o, s, t, w)
	
	val expected15 = List('N', 'T', 'e', 'h', 'i', 'm', 'o', 's', 't', 'w')
                                                  //> expected15  : List[Char] = List(N, T, e, h, i, m, o, s, t, w)
	assert( uniques == expected15)


}