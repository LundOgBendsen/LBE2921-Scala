package helloworld_01

import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.LocalDateTime

object WorldTimes  {
    def main(args: Array[String]) {
      val cph = ZoneId.of("Europe/Copenhagen")
      val nowInCph = ZonedDateTime.of(LocalDateTime.now(), cph)
      val ro = ZoneId.of("Europe/Bucharest")
      val nowInRo = ZonedDateTime.of(LocalDateTime.now(), ro)
    
      println(nowInCph)
       println(nowInRo)
    }
}