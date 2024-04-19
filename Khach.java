package BTVN5_6;

import java.util.ArrayList;

public class Khach {
    private String name;

    public String getName() {
        return name;
    }
    private ArrayList<Tour>tour;
    private ArrayList<Hotel>khachSan;
    private ArrayList<Destination>diaDiem;
    Khach(String name){
        this.name=name;
        this.tour=new ArrayList<>();
        this.khachSan=new ArrayList<>();
        this.diaDiem=new ArrayList<>();
    }
    public void themTour(Tour t){
        tour.add(t);
    }
    public void themHotel(Hotel h)
    {
        khachSan.add(h);
    }
    public void themDiaDiem(Destination d)
    {
        diaDiem.add(d);
    }
    public  int TongTour(){
        return tour.size();
    }

}
