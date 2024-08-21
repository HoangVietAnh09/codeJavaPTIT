package codePTIT.J07051;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

class KhachHang implements Comparable<KhachHang> {
    public static int cnt = 1;
    private String MKH, ten, phong, ngayNhan, ngayTra;
    private int phiDichVu ,totalFee;
    private long day;
    private HashMap<Integer, Integer> menu = new HashMap<Integer, Integer>(4);
    private Date debug1, debug2;


    public KhachHang(String ten, String phong, String ngayNhan, String ngayTra, int phiDichVu) throws ParseException, NullPointerException {
        this.menu.put(1,25);
        this.menu.put(2,34);
        this.menu.put(3,50);
        this.menu.put(4,80);
        this.MKH = "KH" + String.format("%02d", cnt++);
        this.ten = ten;
        this.phong = phong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.phiDichVu = phiDichVu;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date checkInDate = new Date(sdf.parse(ngayNhan).getTime());
        Date checkOutDate = new Date(sdf.parse(ngayTra).getTime());
        this.day = (checkOutDate.getTime() - checkInDate.getTime())/(1000*60*60*24) + 1;
        int floor = Integer.parseInt(phong.substring(0,1));
        this.totalFee = (int) (menu.get(floor)*day) + phiDichVu;
        this.debug1 = checkInDate;
        this.debug2 = checkOutDate;

    }

    public String formatName(String name){
       String[] words = name.trim().split("\\s+");
       for(int i = 0; i < words.length; i++){
           words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
       }
       return String.join(" ", words);
    }


    @Override
    public int compareTo(KhachHang o) {
        return totalFee < o.totalFee ? 1 : -1;
    }



    public String toString() {
        return MKH + " " + formatName(ten) + " " + phong + " " + day + " " + totalFee;
    }
}
