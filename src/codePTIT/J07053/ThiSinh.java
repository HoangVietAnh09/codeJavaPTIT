package codePTIT.J07053;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class ThiSinh {
    public static int cnt = 1;
    private String MTT, hoTen, ngaySinh, danhHieu;
    private double lyThuyet, thucHanh, bonus, tongDiem;
    private int tuoi;
    public ThiSinh(String hoTen, String ngaySinh, double lyThuyet, double thucHanh) throws ParseException {
        this.MTT = "PH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.ngaySinh = formatDate(ngaySinh);
        this.tuoi = 2021 - Integer.parseInt(ngaySinh.split("/")[2]);
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        if(this.lyThuyet >= 8 && this.thucHanh >= 8) this.bonus = 1;
        else if(this.lyThuyet >= 7.5 && this.thucHanh >= 7.5) this.bonus = 0.5;
        else bonus = 0;
        this.tongDiem = (int)(Math.round((this.lyThuyet + this.thucHanh)/2 + this.bonus));
        if(this.tongDiem > 10) this.tongDiem = 10;
        if(this.tongDiem >= 9) this.danhHieu = "Xuat sac";
        else if(this.tongDiem == 8) this.danhHieu = "Gioi";
        else if(this.tongDiem == 7) this.danhHieu = "Kha";
        else if(this.tongDiem >= 5) this.danhHieu = "Trung binh";
        else this.danhHieu = "Truot";
    }
    public String formatDiem(double diem){
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(diem);
    }
    public String formatHoTen(String s){
        String[] words = s.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }
    public String formatDate(String ngaySinh) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(sdf.parse(ngaySinh));
    }
    public String toString(){
        return MTT + " " + formatHoTen(hoTen) + " " + tuoi + " " + formatDiem(tongDiem) + " " + danhHieu;
    }

}
