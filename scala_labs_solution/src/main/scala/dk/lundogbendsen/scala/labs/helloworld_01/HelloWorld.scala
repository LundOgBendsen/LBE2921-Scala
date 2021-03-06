package dk.lundogbendsen.scala.labs.helloworld_01

import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

/***
 * ****************************************
 * 
 * Lab 01 
 * 
 * Purpose: Get acquainted with running Scala code on JVM
 * 
 * 1. 
 * Write a simple hello world, that takes your name from the command line
 * 
 * 2.
 * Use the Jodatime class from Java, 
 * 
 * 3. Compile from command line
 * 
 * 4. Run using Scala
 * 
 * 5. Run using Java 
 * 
 * 6. Inspect generated classes
 * 
 * 7. Add a unit test
 * 
 * 8. Build project using sb build script
 * 
 * 9. Build project using gradle build script
 * 
 * See full description in your labs book
 * 
 * 
 * See more here:   http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
 * 
 * ****************************************
 */
object HelloWorld {
  
    def main(args: Array[String]) {
      val name = scala.io.StdIn.readLine("What is your name?")
      printf("Hello, world! %s\n", greetings(name) )
      println( "The time is : "+ time )
  }
    
   def greetings( name:String) = "Hi to, " + name
   
   def time = {
      val ro = ZoneId.of("Europe/Bucharest")
      ZonedDateTime.of(LocalDateTime.now(), ro)
   }
  
}