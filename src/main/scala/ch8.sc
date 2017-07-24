

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int) = {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  private def processLine(filename: String, width: Int, line: String) = {

    if (line.length > width)
      println(filename + ": " + line.trim)
  }
}



object FindLongLines {
  def main(args: Array[String]) = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}

(x:Int) => x + 1

var increase = (x: Int) => {
  println("we")
  println("are")
  println("here!")
  x + 1
}
increase(19)

val someNumbers = List(-11, -10, -5, 0, 5, 10)

someNumbers.foreach((x:Int) => println(x))

someNumbers.filter(_ > 0)

val f = (_: Int) + (_: Int)
f(5, 6)

someNumbers.foreach(println)


var sum = 0
someNumbers.foreach(sum += _)

sum

def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time = " + System.currentTimeMillis())

printTime()
