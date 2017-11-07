package org.wanggz;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * lambda表达式应用
 */
public class LambdaRun {

    public static void main(String[] args) {
        List<String> students = Lists.newArrayList();

        students.add("test1");
        students.add("test2");
        students.add("test3");
        students.add("test4");
        students.add("test5");

        new Thread(() -> System.out.println("==============")).start();

        Predicate<Integer> testOne = x -> x > 5;

        System.out.println(testOne.test(5));
        System.out.println(testOne.test(6));
        System.out.println(testOne.test(10));

        Supplier<Long> longOne = () -> 20L;
        System.out.println(longOne.get());
    }
}
