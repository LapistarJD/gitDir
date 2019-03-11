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

    }
}
