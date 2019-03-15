object MyScalaTest {
  def m1(x: Int, y: Int): Int = {
    x + y
  }

  val f1 = (x: Int, y: Int) => {
    x + y
  }

  def main(args: Array[String]): Unit = {
    for (x <- 1 to 9; y <- 1 to 9 if y <= x) {
      print(y + "x" + x + "=" + x * y + " ")
      if (x == y) {
        println()
      }

      def m2(x: Int, y: Int): Int = {
        x + y
      }

      println(m2(2, 3))

    }

    val f1 = (x: Int, y: Int) => x + y

    def m1(x: Int, y: Int): Int = {
      x + y
    }

  }

}
