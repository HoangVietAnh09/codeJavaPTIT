package codePTIT.J05060;

import java.text.DecimalFormat;

class ThiSinh {
    public static int cnt = 1;
    private String MTS, hoTen, ngaySinh, xepLoai;
    private double lyThuyet, thucHanh, thuong, tong;

    public ThiSinh(String hoTen, String ngaySinh, double lyThuyet, double thucHanh){
        this.MTS = "PH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        if(this.lyThuyet >= 8 && this.thucHanh >= 8) this.thuong = 1.0;
        else if(this.lyThuyet >= 7.2 && this.thucHanh >= 7.2) this.thuong = 0.5;
        else this.thuong = 0.0;
        this.tong = Math.min(Math.round((this.lyThuyet + this.thucHanh)/2 + this.thuong), 10);
        if(this.tong < 5) this.xepLoai = "Truot";
        else if(this.tong >= 5 && this.tong <=6 ) this.xepLoai = "Trung binh";
        else if(this.tong == 7) this.xepLoai = "Kha";
        else if(this.tong == 8) this.xepLoai = "Gioi";
        else this.xepLoai = "Xuat sac";
    }
    public String format(double diem){
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(diem);
    }

    public String toString(){
        String nam = ngaySinh.split("/")[2];
        return MTS + " " + hoTen + " " + (2021 - Long.parseLong(nam)) + " " + tong + " " + xepLoai;
    }
}
