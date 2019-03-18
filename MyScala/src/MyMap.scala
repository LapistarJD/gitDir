import scala.collection.mutable.Map

object MyMap {
  def main(args: Array[String]): Unit = {
    val map = Map("赵敏" -> 19, "周芷若" -> 18, ("张无忌", 21))

    map += ("宋青书" -> 25, ("小昭", 22))

    map("张无忌") = 100

    for (elem <- map) {
      println(elem)
    }
//    (宋青书,25)
//    (周芷若,18)
//    (小昭,22)
//    (张无忌,100)
//    (赵敏,19)
  }
}
