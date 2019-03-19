package cn.itGit;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void learning(Student stu){
        System.out.println(stu.name+",有很好的学习方法!");
    }

    public static void main(String[] args) {
        Student zhang3 = new Student("zhang3", 16);
        zhang3.learning(zhang3);

        int[] arr =new int[3];
        arr[0]=1;
        arr[1]=3;
        arr[2]=2;
        for (int i : arr) {
            System.out.println(i);
        }

        Per per = Per.getPer();
        per.myTest("name","age","");
        System.out.println(per);
    }
}
