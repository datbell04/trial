package BTVN5_6;

import java.util.ArrayList;

public class Destination {
    private String name;

    public String getName() {
        return name;
    }
    private ArrayList<Tour> tour;
    private ArrayList<Hotel>khachSan;
    private ArrayList<Khach>customer;
    Destination(String name){
        this.name=name;
        this.tour=new ArrayList<>();
        this.khachSan=new ArrayList<>();
        this.customer=new ArrayList<>();
    }
    public void themTour(Tour t){
        tour.add(t);
    }
    public void themHotel(Hotel h)
    {
        khachSan.add(h);
    }
    public void themKhach(Khach k)
    {
        customer.add(k);

    }
    public void TongKhach()
    {
        customer.size();
    }
    public void TongTour()
    {
        tour.size();
    }
    public void TongHotel()
    {
        khachSan.size();
    }
}
