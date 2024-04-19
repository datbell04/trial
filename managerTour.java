package BTVN5_6;

import BTVN5_6QLDL.ChuyenDuLich;
import BTVN5_6QLDL.KhachDuLich;

import java.util.HashMap;
import java.util.HashSet;

public class managerTour {
    public HashMap<String, Tour> tours;
    public HashMap<String, Hotel> hotels;
    public HashMap<String, Khach> khachs;
    public HashMap<String, Destination> destinations;
    public HashSet<Tour> cancelTours;

    public managerTour() {
        tours = new HashMap<>();
        khachs = new HashMap<>();
        destinations = new HashMap<>();
        hotels = new HashMap<>();
        cancelTours = new HashSet<>();
    }

    public void addTour(String tourName) {
        tours.put(tourName, new Tour(tourName));
    }

    public void addHotel(String hotelName) {
        hotels.put(hotelName, new Hotel(hotelName));
    }

    public void addCustomer(String customerName) {
        khachs.put(customerName, new Khach(customerName));
    }

    public void addDestination(String destinationName) {
        destinations.put(destinationName, new Destination(destinationName));
    }

    public void makeReservation(String customerName, String tourName, String destinationName, String hotelName) {
        Khach customer = khachs.get(customerName);
        Tour tour = tours.get(tourName);
        Destination destination = destinations.get(destinationName);
        Hotel hotel = hotels.get(hotelName);
        if (customer != null && tour != null && destination != null && hotel != null) {
            customer.themTour(tour);
            customer.themDiaDiem(destination);
            customer.themHotel(hotel);
            tour.themKdl(customer);
            tour.themDiaDiem(destination);
            tour.themHotel(hotel);
            destination.themTour(tour);
            destination.themKhach(customer);
            destination.themHotel(hotel);
            hotel.themTour(tour);
            hotel.themDiaDiem(destination);
            hotel.themKdl(customer);
        }
    }

    public void cancelTour(String tourName) {
        Tour tour = tours.get(tourName);
        if (tour != null) {
            cancelTours.add(tour);
        }
    }

    public void printStatistics() {
        System.out.println("Total number of customers: " + khachs.size());
        System.out.println("Total number of tours: " + tours.size());
        System.out.println("Total number of locations: " + destinations.size());
        System.out.println("Total number of hotels: " + hotels.size());
        System.out.println("Total number of cancelled tours: " + cancelTours.size());
        for (Tour tour : tours.values()) {
            System.out.println("Tour: " + tour.getName() + ", Number of customers: " + tour.TongKhach());
        }
        for (Khach customer : khachs.values()) {
            System.out.println("Customer: " + customer.getName() + ", Number of tours booked: " + customer.TongTour());
        }
    }
}


