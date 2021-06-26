/*Collections class
* Collection -> Set, List, Queue, Dequeue
* Map -> SortedMap
* */
package com.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre=new Theatre("Olympian",8,12);
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else{
            System.out.println("Seat is taken");
        }
        List<Theatre.Seat> newList = new ArrayList<Theatre.Seat>(theatre.seats);
        Collections.shuffle(newList);
        Collections.reverse(newList);
        printList(theatre.seats);
        printList(newList);
        Collections.swap(newList,5,0);
        Theatre.Seat minSeat = Collections.min(newList);
        Theatre.Seat maxSeat = Collections.max(newList);

      /*  List<Theatre.Seat> test = new ArrayList<Theatre.Seat>(96+1);
        Collections.copy(test,theatre.seats);
        printList(test);*/

        System.out.println("Minimum ===> "+minSeat.getSeatNumber()+" "+"Maximum ===> "+maxSeat.getSeatNumber());

        Collections.sort(theatre.seats, Theatre.PRICE_ORDER);
        printList(theatre.seats);
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat i:list) {
            System.out.print(i.getSeatNumber()+"  $"+i.getPrice()+"  ");
        }
        System.out.println();
    }
}
