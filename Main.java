package com.company;



import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Passenger passenger1 = new Passenger("Ganesh Nagar", "Coimbatore", "TamilNadu", "Radha"
                , " +91 90005 90005", "sss@gmail.com");
        Flight flight1 = new Flight(60, "Vistara", "international 123456",
                "29 Oct 2019", "13:00:00", "29 Oct 2019", "14:00:00");
        RegularTicket regularTicket = new RegularTicket("1624539", "Coimbatore", "Kolkata", flight1, passenger1, 30,
                10000.0f, true, "Raw Veg meal", "juice", "Chips");
        TouristTicket touristTicket = new TouristTicket("1234AAA", "Coimbatore", "Mumbai", flight1, passenger1, 30,
                20000.0f, true, "Accord Internationals","five" );
        System.out.println(Arrays.toString(flight1.getFlightDetails()));

        System.out.println(flight1.getAirline());
        System.out.println(regularTicket.getSpecialService());
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}