package com.java;
/*
*
* */


import java.util.*;


public class Theatre {
    private final String theatreName;
        public List<Seat> seats = new ArrayList<>();
        //private List<Seat> seats = new LinkedList<>();
        //private Collection<Seat> seats = new LinkedList<>();



    //private Queue<Seat> seats = new LinkedList<>();
    public String getTheatreName() {
        return theatreName;
    }

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            if(o1.getPrice()>o2.getPrice()){return 1;}
            else if(o1.getPrice()<o2.getPrice()){return -1;}
            return 0;
        }
    };

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null); //increases performance

        System.out.println(foundSeat);
        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }
        else {
            System.out.println("There is no seat : "+seatNumber);
            return false;
        }
    }
  /*      for(Seat seat: seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat=seat;
                break;
            }
        }
        if(requestedSeat==null){
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }*/
    public void getSeats(){
        for (Seat s: seats) {
            System.out.println(s.getSeatNumber());
        }
    }
    public  Theatre(String theatreName, int numRows, int seatsPerRow){
        this.theatreName = theatreName;

        int lastRow = 'A'+(numRows -1);
        for(char row='A'; row<=lastRow; row++){

            for(int seatNum =1; seatNum<=seatsPerRow; seatNum++){
                double price=12.00;
               if(row<'D' && (seatNum>=4 && seatNum<=9)){
                   price=14.00;
               }else if(row>'F' && (seatNum<4 && seatNum<=9)){price=7.00;}
                Seat seat = new Seat(row + String.format("%02d", seatNum),price);

                seats.add(seat);
            }
        }



    }

     class Seat implements Comparable<Seat>{
        public final String seatNumber;
        public boolean reserved = false;
        public double price;

         public double getPrice() {
             return price;
         }

         public void setPrice(int price) {
             this.price=price;
         }

         public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }
         public Seat(String seatNumber) {
             this.seatNumber = seatNumber;
         }

        public boolean reserve() {
            if(!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            }
            else{return false;}
        }

        public boolean cancel() {
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+seatNumber+ " cancelled");
                return true;
            }
            else{return false;}
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat o) {
            return this.getSeatNumber().compareToIgnoreCase(o.getSeatNumber());
        }
    }
}


