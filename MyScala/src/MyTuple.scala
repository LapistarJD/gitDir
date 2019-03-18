object MyTuple {
  def main(args: Array[String]): Unit = {
    //创建元组格式：
    //val tuple=(元素,元素...)
    val t: (String, Int, Double, MyTuple.type) = ("田七", 12, 0.3, MyTuple)

    //获取元组中的值格式：
    //使用下划线加脚标 ，例如 t._1  t._2  t._3
    //注意：元组中的元素脚标是从1开始的
    println(t._1)   //田七
    println(t._2)   //12
    println(t._3)   //0.3
    println(t._4)   //MyTuple$@75bd9247

    val strT = Array("张三", "李四", "王五", "赵六")
    val intT = Array(12, 13, 14, 15, 16)

    val strInt: Array[(String, Int)] = strT.zip(intT)
    for (elem <- strInt) {
      println(elem)
//      (张三,12)
//      (李四,13)
//      (王五,14)
//      (赵六,15)
    }


    val toMap: Map[String, Int] = strInt.toMap

    for (elem <- toMap) {
      println(elem)
      //      (张三,12)
      //      (李四,13)
      //      (王五,14)
      //      (赵六,15)
    }

    val allIntStr: Array[(Int, String)] = intT.zipAll(strT, 10, "田七")

    val allToMap: Map[Int, String] = allIntStr.toMap

    for (elem <- allToMap) {
      println(elem)
      //      (14,王五)
      //      (13,李四)
      //      (12,张三)
      //      (16,田七)
      //      (15,赵六)
    }


  }
}
