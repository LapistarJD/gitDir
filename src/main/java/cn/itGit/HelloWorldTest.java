package cn.itGit;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldTest {
    public static void main(String[] args) {
        System.out.println("welcome to java!");
        List<Integer> integers = new ArrayList<Integer>(3);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        /*
         * 添加数组,求和
         * */
        int[] ints = new int[10];
        ints[0] = 1;
        ints[1] = 1;
        ints[2] = 1;
        ints[3] = 1;
        ints[4] = 1;
        ints[5] = 1;
        ints[6] = 1;
        ints[7] = 1;
        ints[8] = 1;
        ints[9] = 1;
        int count = 0;
        for (int anInt : ints) {
            count += anInt;
        }
        System.out.println(count);


    }
}
