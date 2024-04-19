package BTVN5_6;

import java.util.ArrayList;

public class Tour {
    private String name;

    public String getName() {
        return name;
    }

    private ArrayList<Khach>customer;
    private ArrayList<Hotel>khachSan;
    private ArrayList<Destination>diaDiem;
    Tour(String name){
        this.name=name;
        this.customer=new ArrayList<>();
        this.khachSan=new ArrayList<>();
        this.diaDiem=new ArrayList<>();

    }
    public void themKdl(Khach a)
    {
        customer.add(a);
    }
    public void themHotel(Hotel h)
    {
        khachSan.add(h);
    }
    public void themDiaDiem(Destination d)
    {
        diaDiem.add(d);
    }
    public int TongKhach()
    {
        return customer.size();
    }
    public int TongKhachsan()
    {
        return  khachSan.size();
    }
    public int TongdiaDiem()
    {
        return diaDiem.size();
    }





}
