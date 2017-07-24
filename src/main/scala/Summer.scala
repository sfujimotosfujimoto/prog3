import ChecksumAccumulator.calculate

object Summer extends App {
    for (season <- List("fall", "winter", "spring"))
      println(season + ": " + calculate(season))
}

