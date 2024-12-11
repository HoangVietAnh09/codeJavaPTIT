package codePTIT.ThucHanh3.B2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentMap;

public class NhanVien implements Comparable<NhanVien> {
    private String MCN, ten, gioVao, gioRa, trangThai;
    private long gio, phut, tong;


    public NhanVien(String MCN, String ten, String gioVao, String gioRa) throws ParseException {
        this.MCN = MCN;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try{
            tong = (sdf.parse(gioRa).getTime() - sdf.parse(gioVao).getTime())/1000;
        }catch(Exception e){

        }
        if((tong/3600-1) >= 8) trangThai = "DU";
        else trangThai = "THIEU";
    }

    public String toString(){
        return MCN + " " + ten + " " + (tong/3600-1) + " gio " + tong/60%60 + " phut " + trangThai;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(tong == o.tong){
            return MCN.compareTo(o.MCN);
        }
        return -Long.compare(tong, o.tong);
    }
}
