package cn.itGit;

import java.util.LinkedList;

public class JvmTest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        LinkedList<String> ll = new LinkedList<String>();
        int[] arr = new int[5];
        Student[] stus = new Student[4];
        stus[0] = new Student("zhang3", 18);
        stus[1] = new Student("li4", 19);
        stus[2] = new Student("wang5", 20);
        stus[3] = new Student();

        for (Student student : stus) {
            System.out.println(student.name+" --> "+student.age);
        }


        Student s= new GoodStudent();
      //  s.hardLearn();
        GoodStudent gs = new GoodStudent();
        gs.hardLearn("zhang3",16);

    }

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student() {
        }
    }

    static class GoodStudent extends Student{
        private String name;
        private int age;

        public GoodStudent(String name, int age,int num) {
            this.name = name;
            this.age = age;
        }

        public GoodStudent() {
        }

        public static void  hardLearn(String name,int age){
            System.out.println("好好学习");
        }
    }
}
