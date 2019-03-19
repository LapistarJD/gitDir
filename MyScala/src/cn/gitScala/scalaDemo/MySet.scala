package cn.gitScala.scalaDemo

object MySet {
  def main(args: Array[String]): Unit = {
    //定义一个不可变的Set集合
    //定义：val set=Set(元素,元素,.....)

    val set = Set(1, 2, 3, 4, 5, 6, 7)
    println(set)
    //Set(5, 1, 6, 2, 7, 3, 4)

    //元素个数
    val size: Int = set.size
    println(size)
    //7

    //取集合最小值
    val min: Int = set.min
    println(min)
    //1

    //取集合最大值
    val max: Int = set.max
    println(max)
    //7

    //将元素和set1合并生成一个新的set，原有set不变
    val set2: Set[Int] = set + 8
    println(set) //Set(5, 1, 6, 2, 7, 3, 4)
    println(set2) //Set(5, 1, 6, 2, 7, 3, 8, 4)


    val set1 = Set(7, 8, 9)
    println(set1)
    //Set(7, 8, 9)

    //两个集合的交集
    val set3: Set[Int] = set & set1
    println(set) //Set(5, 1, 6, 2, 7, 3, 4)
    println(set1) //Set(7, 8, 9)
    println(set3) //Set(7)

    //两个集合的并集
    val set4: Set[Int] = set ++ set1
    println(set4)
    //Set(5, 1, 6, 9, 2, 7, 3, 8, 4)

    //在第一个set基础上去掉第二个set中存在的元素
    val set5: Set[Int] = set -- set1
    println(set5)
    //Set(5, 1, 6, 2, 3, 4)

    //返回第一个不同于第二个set的元素集合
    val set6: Set[Int] = set &~ set1
    println(set6)
    //Set(5, 1, 6, 2, 3, 4)

    //计算符合条件的元素个数
    val count: Int = set.count(_ > 5)
    println(count) //2

    //返回第一个不同于第二个的元素集合
    val set7: Set[Int] = set.diff(set1)
    println(set7)
    //Set(5, 1, 6, 2, 3, 4)

    //返回第一个不同于第二个的元素集合
    val set8: Set[Int] = set1.diff(set)
    println(set8)
    //Set(8, 9)

    //取子set(2,5为元素位置, 从0开始，包含头不包含尾)
    val set9: Set[Int] = set.slice(2, 5)
    println(set9)
    //Set(6, 2, 7)

    //迭代所有的子set，取指定的个数组合
    set1.subsets(2).foreach(x => println(x))
    //Set(7, 8)
    //Set(7, 9)
    //Set(8, 9)

  }

}

//导入可变Set包
import scala.collection.mutable._

object MyMutSet {
  def main(args: Array[String]): Unit = {

    //定义一个可变的Set
    val set1 = new HashSet[Int]()
    val set2 = HashSet[Int](1, 2, 3)


    //添加元素
    set1 += 1
    println(set1)   //Set(1)

    //添加元素  add等价于+=
    set1.add(2)
    println(set1)   //Set(1,2)


    //向集合中添加元素集合
    set1 ++= Set(1, 4, 5)
    println(set1)   //Set(1, 5, 2, 4)

    //删除一个元素
    set1 -= 5
    println(set1)   //Set(1, 2, 4)

    //删除一个元素
    set1.remove(1)
    println(set1)   //Set(2, 4)

    //返回第一个不同于第二个set的元素集合
    val set3: HashSet[Int] = set1 &~ set2
    println(set3)   //Set(4)
    val set4: HashSet[Int] = set2 &~ set1
    println(set4)   //Set(1, 3)

  }
}