package com.company;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculate sum = (a,b) -> a*b;
        System.out.println(sum.sum(100,300));


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test");
            }
        }).start();

        new Thread(()-> System.out.println("Test 2")).start();

        ArrayList<String> newList = new ArrayList<>();
        newList.add("One");
        newList.add("Two");
        newList.add("Three");
        newList.add("Four");

        Predicate<String> testPredicate = (s) -> s.startsWith("T");

        for (String s: newList) {
            if(testPredicate.test(s)){
                System.out.println(s);
            }
        }

    A a = new A();
        a.test(2);
    }

    public int test(){
        testStatic();
        return 123;

    }

     static void testStatic(){
        new Main().test();
    }
}


@FunctionalInterface
interface Calculate{
    public int sum(int a,int b);

    public static void test(){
        System.out.println("Test");
    }
    public static void tes1(){
        System.out.println("Test");
    }
}

interface Test{
    int a=30;
    int test(int a);
}

class A implements Test{

    @Override
    public int test(int a) {

        System.out.println(Test.a);
        return 0;
    }
}

abstract class AbstratcExample{

}