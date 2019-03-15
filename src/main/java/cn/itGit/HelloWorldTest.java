package cn.itGit;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldTest {
    public int m1(int x, int y) {
        return x + y;
    }

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

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            System.out.println(i);
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }

        // SCALA
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + j * i + " ");
                if (j == i) {
                    System.out.println();
                }
            }
        }

    }
}
