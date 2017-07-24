//chapter7

// Returns a row as a seq
// 7.8
def makeRowSeq(row: Int) =
for (col <- 1 to 10) yield {
  val prod = (row * col).toString
  val padding = " " * (4 - prod.length)
  padding + prod
}

makeRowSeq(12)

def makeRow(row: Int) = makeRowSeq(row).mkString

makeRow(10)


def multiTable() = {
  val tableSeq =
    for (row <- 1 to 10)
      yield makeRow(row)

  tableSeq.mkString("\n")
}

multiTable()


