package BTVN5_6;



public class main {
    public static void main(String[] args) {
        managerTour manager = new managerTour();

        // Adding tours, customers, booking tours, cancelling tours, etc.
        manager.addTour("Tour A");
        manager.addTour("Tour B");

        manager.addCustomer("John");
        manager.addCustomer("Alice");

        manager.addDestination("Ha Noi");
        manager.addDestination("Thanh Hoa");

        manager.addHotel("hotel1");
        manager.addHotel("hotel2");

        manager.makeReservation("John", "Tour A","Ha Noi","hotel1");
        manager.makeReservation("Alice", "Tour B","Ha Noi","Hotel2");

        manager.cancelTour("Tour B");

        manager.printStatistics();
    }

}

