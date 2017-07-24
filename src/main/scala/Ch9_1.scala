/*  / sfujimoto: 2017/07/24 16:12 */

object Ch9_1 extends App {
  object FileMatcher {
    def filesHere = (new java.io.File(".")).listFiles

    def filesEnding(query: String) =
      for(file <- filesHere; if file.getName.endsWith(query))
        yield file

  }

  println(FileMatcher.filesHere)
  FileMatcher.filesEnding(".scala")
}
