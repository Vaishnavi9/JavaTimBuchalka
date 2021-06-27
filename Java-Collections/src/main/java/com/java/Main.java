/*Collections class
* Collection -> Set, List, Queue, Dequeue
* Map -> SortedMap
* */
package com.java;


import java.util.*;

/*public class Main {

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

      *//*  List<Theatre.Seat> test = new ArrayList<Theatre.Seat>(96+1);
        Collections.copy(test,theatre.seats);
        printList(test);*//*

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
}*/
/******************************************************************************************************/
class MapExample{
    public static void main(String[] args) {
        Map<String, String> example = new HashMap<>();
        example.put("Java","I know a bit java");
        example.put("C","I know a tiny bit of C");
        example.put("Python","Something new and exciting");
        example.put("Scala","It does not exist now");
        //iterateMap(example);

        //example.clear();
        System.out.println(example.entrySet());
        System.out.println(example.containsKey("Pfh"));
        System.out.println(example.replace("J","I"));//return null if key value is not present
        if(example.containsKey("lskjda")){
            System.out.println(example.replace("Python","Language for data science"));
        }
        else{
            System.out.println("Not present");
        }

        System.out.println(example.computeIfPresent("fghkdf",(key,value)-> value+"TBN"));

        example.compute("Scala",(key, value)->value+1000);
        example.computeIfAbsent("IOISU",(k)-> "this is crazy");
        iterateMap(example);
    }

    public static void iterateMap(Map<String, String> example){
        for (String key: example.keySet()) {
            System.out.println(key+" :"+ example.get(key));
        }
    }
}
