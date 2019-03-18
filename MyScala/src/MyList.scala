object MyList {

  def main(args: Array[String]): Unit = {
    /**
      * 不可变List集合操作
      */
    //创建一个不可变的集合
    val lst1 = List(1, 2, 3)
    println(lst1)
    //List(1,2,3)


    //补充：另一种定义list方法
    val other_lst = 2 :: Nil
    println(other_lst)
    //List(2)


    //获取集合的第一个元素
    val first = lst1.head
    println(first)
    //1


    //获取集合中除第一个元素外的其他元素集合,
    val tail = lst1.tail
    println(tail)
    //List(2, 3)


    //补充：其中如果 List 中只有一个元素，那么它的 head 就是这个元素，它的 tail 就是 Nil；
    println(other_lst.head + "----" + other_lst.tail)
    //2----List()


    //将0插入到lst1的前面生成一个新的List
    val lst2 = 0 :: lst1
    val lst3 = lst1.::(0)
    val lst4 = 0 +: lst1
    val lst5 = lst1.+:(0)
    println(lst2) //List(0, 1, 2, 3)
    println(lst3) //List(0, 1, 2, 3)
    println(lst4) //List(0, 1, 2, 3)
    println(lst5) //List(0, 1, 2, 3)


    //将一个元素添加到lst1的后面产生一个新的集合
    val lst6 = lst1 :+ 3
    val lst0 = List(4, 5, 6)
    println(lst6) //List(1, 2, 3, 3)
    println(lst0) //List(4, 5, 6)


    //将2个list合并成一个新的List
    val lst7 = lst1 ++ lst0
    println(lst7)
    //List(1, 2, 3, 4, 5, 6)


    //将lst0插入到lst1前面生成一个新的集合
    val lst8 = lst1 ++: lst0
    println(lst8)
    //List(1, 2, 3, 4, 5, 6)


    //将lst0插入到lst1前面生成一个新的集合
    val lst9 = lst1.:::(lst0)
    println(lst9)
    // List(4, 5, 6, 1, 2, 3)

  }

}

import scala.collection.mutable.ListBuffer

object MyMutList {

  def main(args: Array[String]): Unit = {
    //构建一个可变列表，初始有3个元素1,2,3
    val lst0 = ListBuffer[Int](1, 2, 3)
    println(lst0) //ListBuffer(1, 2, 3)

    //创建一个空的可变列表
    val lst1 = new ListBuffer[Int]
    println(lst1) //ListBuffer()

    //向lst1中追加元素，注意：没有生成新的集合
    lst1 += 4
    lst1.append(5)
    println(lst1) //ListBuffer(4,5)

    //将lst1中的元素最近到lst0中， 注意：没有生成新的集合
    lst0 ++= lst1
    println(lst0) //ListBuffer(1, 2, 3, 4, 5)

    //将lst0和lst1合并成一个新的ListBuffer 注意：生成了一个集合
    val lst2 = lst0 ++ lst1
    println(lst2) //ListBuffer(1, 2, 3, 4, 5, 4, 5)

    //将元素追加到lst0的后面生成一个新的集合
    val lst3 = lst0 :+ 5
    println(lst0) //ListBuffer(1, 2, 3, 4, 5)
    println(lst3) //ListBuffer(1, 2, 3, 4, 5, 5)

    //删除元素,注意：没有生成新的集合
    val lst4 = ListBuffer[Int](1, 2, 3, 4, 5)
    lst4 -= 5
    println(lst4) //ListBuffer(1, 2, 3, 4)

    //删除一个集合列表,生成了一个新的集合
    val lst5 = lst4 -- List(1, 2)
    println(lst5) //ListBuffer(3, 4)

    //把可变list 转换成不可变的list 直接加上toList
    val lst6 = lst5.toList
    println(lst6) //List(3, 4)

    //把可变list 转变数组用toArray
    val lst7 = lst5.toArray
    println(lst7.toBuffer) //ArrayBuffer(3, 4)
  }

}

object MyListTest {
  def main(args: Array[String]): Unit = {
    //创建一个List
    val list0 = List(1, 7, 9, 8, 0, 3, 5, 4, 6, 2)

    //将list0中的每一个元素乘以10后生成一个新的集合
    val list1 = list0.map(x => x * 10)
    println("list1==== " + list1)
    //list1==== List(10, 70, 90, 80, 0, 30, 50, 40, 60, 20)

    //将list0中的偶数取出来生成一个新的集合
    val list2 = list0.filter(x => x % 2 == 0)
    println("list2==== " + list2)
    //list2==== List(8, 0, 4, 6, 2)

    //将list0排序后生成一个新的集合
    val list3 = list0.sorted
    val list4 = list0.sortBy(x => x)
    val list5 = list0.sortWith((x, y) => x < y)
    println("list3==== " + list3)
    //list3==== List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("list4==== " + list4)
    //list4==== List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("list5==== " + list5)
    //list5==== List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    //反转顺序
    val list6 = list3.reverse
    println("list6==== " + list6)
    //list6==== List(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

    //将list0中的元素4个一组,类型为Iterator[List[Int]]
    val list7 = list0.grouped(4)
    println("list7==== " + list7) //list7==== non-empty iterator
    for (elem <- list7) {
      println(elem)
      //List(1, 7, 9, 8)
      //List(0, 3, 5, 4)
      //List(6, 2)
    }

    //将Iterator转换成List
    val list8 = list7.toList
    println("list8==== " + list8)
    //list8==== List(List(1, 7, 9, 8), List(0, 3, 5, 4), List(6, 2))

    //将多个list压扁成一个List
    val list9 = list8.flatten
    println("list9==== " + list9)
    //list9==== List(1, 7, 9, 8, 0, 3, 5, 4, 6, 2)

    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    //先按空格切分，在压平
    val result1 = lines.flatMap(_.split(" "))
    println("result1==== " + result1)
    //result1==== List(hello, tom, hello, jerry, hello, jerry, hello, kitty)

    //并行计算求和
    val result2 = list0.par.sum
    println("result2==== " + result2)
    //result2==== 45

    //化简：reduce
    //将非特定顺序的二元操作应用到所有元素
    val result3 = list0.reduce((x, y) => x + y)
    println("result3==== " + result3)
    //result3==== 45

    //按照特定的顺序
    val result4 = list0.reduceLeft(_ + _)
    val result5 = list0.reduceRight(_ + _)
    println("result4==== " + result4)
    //result4==== 45
    println("result5==== " + result5)
    //result5==== 45

    //折叠：有初始值（无特定顺序）
    val result6 = list0.fold(100)((x, y) => x + y)
    println("result6==== " + result6)
    //result6==== 145

    //折叠：有初始值（有特定顺序）
    val result7 = list0.foldLeft(100)((x, y) => x + y)
    println("result7==== " + result7)
    //result7==== 145

    //聚合
    val list10 = List(List(1, 2, 3), List(4, 5, 6), List(7, 8), List(9, 0))
    val result8 = list10.par.aggregate(10)(_ + _.sum, _ + _)
    println("result8==== " + result8)
    //result8==== 85    不一定

    //获取到参与并行计算的线程
    println(list10.par.collect {
      case _ => Thread.currentThread().getName
    }.distinct)
    //ParVector(ForkJoinPool-1-worker-29, ForkJoinPool-1-worker-25, ForkJoinPool-1-worker-11, ForkJoinPool-1-worker-27)

    val l1 = List(5, 6, 4, 7)
    val l2 = List(1, 2, 3, 4)
    //求并集
    val r1 = l1.union(l2)
    println("r1=== " + r1)
    //r1=== List(5, 6, 4, 7, 1, 2, 3, 4)
    val r0: List[Int] = l1.union(l2).distinct
    println("r0=== " + r0)
    //r0=== List(5, 6, 4, 7, 1, 2, 3)


    //求交集
    val r2 = l1.intersect(l2)
    println("r1=== " + r2)
    //r1=== List(4)

    //求差集
    val r3 = l1.diff(l2)
    println("r3=== " + r3)
    //r3=== List(5, 6, 7)

  }

}



