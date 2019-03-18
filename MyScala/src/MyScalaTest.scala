import scala.collection.mutable.ArrayBuffer

object MyScalaTest {
  def m1(x: Int, y: Int): Int = {
    x + y
  }

  val f1 = (x: Int, y: Int) => {
    x + y
  }

  def main(args: Array[String]): Unit = {
    val ints2 = new ArrayBuffer[Int](1)
    ints2(0)=11
    ints2(1)=22
    ints2(2)=33
    ints2(3)=44
    ints2(4)=55
    for (elem <- ints2) {
      println(elem)
    }
  /*  val ints3 = new Array[Int](1)
    ints3(0)=11
    ints3(1)=22
    ints3(2)=33
    ints3(3)=44
    ints3(4)=55
    for (elem <- ints2) {
      println(elem)
    }*/


    val ints = Array(1,2,3)
    ints(0)=123
    println(ints(0))
    val ints1 = ArrayBuffer(1,2,3)
    ints1(0)=11
    ints1+=4
    for (elem <- ints1) {
      println(elem)
    }


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
