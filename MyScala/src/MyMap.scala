object MyImmutMap {
  def main(args: Array[String]): Unit = {
    //定义Map集合
    //1.val map=Map(键 -> 值 , 键 -> 值...)
    //2.利用元组构建  val map=Map((键，值), (键，值) , (键，值)....)
    val map1 = Map("zhangsan" -> 30, "lisi" -> 40)
    val map2 = Map(("zhang3", 31), ("li4", 41))


    val map3: Map[String, Int] = map1 ++ map2
    map3.map(x => println(x._1 + " -><- " + x._2))
    //lisi -><- 40
    //zhangsan -><- 30
    //zhang3 -><- 31
    //li4 -><- 41
    val map4: Map[String, Int] = map1 + (("wangwu", 50))
    map4.map(x => println(x._1 + " #### " + x._2))
    //zhangsan #### 30
    //lisi #### 40
    //wangwu #### 50

    val map5: Map[String, Int] = map1 - "zhangsan"
    map5.map(x => println(x._1 + " ---- " + x._2))
    //lisi ---- 40

    val map6: Map[String, Int] = map1 -- Array("zhangsan","lisi")
    println(map6.size)   // 0

    //操作map集合
    //获取值： 值=map(键)
    println("zhangsan -> " + map1("zhangsan")) //zhangsan -> 30
    println("li4 -> " + map2("li4")) //li4 -> 41
    println("wang5 -> " + map2.get("wang5")) //wang5 -> None
    println("wang5 -> " + map2.getOrElse("wang5", 51)) //wang5 -> 51
    //原则：通过先获取键，在获取键对应值。

    //遍历map集合
    //方法一：显示所有的key
    val keys: Iterable[String] = map1.keys
    for (elem <- keys) {
      println(elem + " -> " + map1(elem))
      //lisi -> 40
      //zhangsan -> 30
    }

    //方法二：显示所有的key
    val keySet: collection.Set[String] = map2.keySet
    for (elem <- keySet) {
      println(elem + " -> " + map2(elem))
      //zhang3 -> 31
      //li4 -> 41
    }

  }
}

//导包
import scala.collection.mutable._
object MyMutMap{
  def main(args: Array[String]): Unit = {


    //声明一个可变集合
    val user =HashMap("zhangsan"->50,"lisi" -> 100)
    val stu =HashMap("wang5"->51,"zhao6" -> 91)

    user ++= stu
    //添加键值对
    user +=("wangwu" -> 30)

    //添加多个键值对
    user += ("zhangsan0" -> 30,"lisi0" -> 20)
    println(user.size)    // 7
    user.map(x=>println(x._1+"    "+x._2))
    //    zhangsan0    30
    //    lisi    100
    //    wang5    51
    //    zhangsan    50
    //    lisi0    20
    //    zhao6    91
    //    wangwu    30

    //方法一：显示所有的key
    user.keys

    //方法二：显示所有的key
    user.keySet

    //通过key获取value
    user("zhangsan")

    //通过key获取value 有key对应的值则返回，没有就返回默认值0，
    user.getOrElse("zhangsan",0)

    //没有对应的key，返回默认0
    user.getOrElse("zhangsan1",0)

    //更新键值对
    user("zhangsan") = 55
    user("zhangsan")

    //更新多个键值对
    user += ("zhangsan" -> 60, "lisi" -> 50)

    //删除key
    user -=("zhangsan")

    //删除key
    user.remove("zhangsan0")

    user--=Array("lisi0","lisi","wangwu")

    //遍历map 方法一：通过key值
    for(x<- user.keys) println(x+" -> "+user(x))
    //wang5 -> 51
    //zhao6 -> 91

    //遍历map 方法二：模式匹配
    for((x,y) <- user) println(x+" -> "+y)
    //wang5 -> 51
    //zhao6 -> 91

    //遍历map 方法三：通过foreach
    user.foreach{case (x,y) => println(x+" -> "+y)}
    //wang5 -> 51
    //zhao6 -> 91



  }
}