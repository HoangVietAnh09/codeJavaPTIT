package codePTIT.J05046;

import java.util.*;

class LoHang {
    private String MDH, donHang;
    private long soLuong, donGia;
    private double trietKhau;
    public LoHang(String donHang, long soLuong, long donGia){
        this.donHang = donHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        if(this.soLuong > 10) this.trietKhau = 0.05;
        else if(this.soLuong >= 8) this.trietKhau = 0.02;
        else if(this.soLuong >= 5) this.trietKhau = 0.01;
        else this.trietKhau = 0;
    }

    public void setMDH(String MDH){
        this.MDH = MDH;
    }
    public String getDonHang(){
        return donHang;
    }

    public String toString(){
        return MDH + " " + donHang + " " + Math.round(trietKhau*donGia*soLuong) + " " + (donGia*soLuong-Math.round(trietKhau*donGia*soLuong));
    }
}
