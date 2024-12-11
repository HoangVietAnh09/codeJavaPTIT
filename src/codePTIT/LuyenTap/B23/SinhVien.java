package codePTIT.LuyenTap.B23;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien implements Comparable<SinhVien>{
    private String hoTen, batDau, ketThuc;
    private long online;

    public SinhVien(String hoTen, String batDau, String ketThuc) throws ParseException {
        this.hoTen = hoTen;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.online = (sdf.parse(ketThuc).getTime() - sdf.parse(batDau).getTime())/1000;

    }
    public String toString(){
        return hoTen + " " + (online/60);
    }

    @Override
    public int compareTo(SinhVien sv){
        if(online == sv.online){
            return hoTen.compareTo(sv.hoTen);
        }
        return -Long.compare(online, sv.online);
    }
}
