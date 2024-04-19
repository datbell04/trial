package BTVN5_6;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Khach> customer;
    private ArrayList<Tour>tour;
    private ArrayList<Destination>diaDiem;
    Hotel(String name){
        this.name=name;
        this.customer=new ArrayList<>();
        this.tour=new ArrayList<>();
        this.diaDiem=new ArrayList<>();

    }
    public void themKdl(Khach a)
    {
        customer.add(a);
    }
    public void themTour(Tour h)
    {
        tour.add(h);
    }
    public void themDiaDiem(Destination d)
    {
        diaDiem.add(d);
    }
    public void TongKhach()
    {
        customer.size();
    }
    public void TongTour()
    {
        tour.size();
    }
    public void TongdiaDiem()
    {
        diaDiem.size();
    }
}
