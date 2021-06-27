package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList test = new ArrayList();

        test.add(1);
        test.add(2);
        test.add("uyfyu");
        test.add(0);

        printList(test);

        ArrayList<Integer> example2 = new ArrayList<Integer>();
        example2.add(1);
        //example2.add("jhfs"); //gives compile time error
        example2.add(1);
        example2.add(1);

    }

    public static void printList(ArrayList example){
        for (Object o: example) {
            System.out.println((Integer)o);
        }
    }
}
