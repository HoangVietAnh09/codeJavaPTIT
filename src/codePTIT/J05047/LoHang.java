package codePTIT.J05047;

import java.util.*;

class LoHang implements Comparable<LoHang> {
    private String MDH, donHang;
    private long soLuong, donGia, tienTrietKhau;
    private double trietKhau;
    public LoHang(String donHang, long soLuong, long donGia){
        this.donHang = donHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        if(this.soLuong > 10) this.trietKhau = 0.05;
        else if(this.soLuong >= 8) this.trietKhau = 0.02;
        else if(this.soLuong >= 5) this.trietKhau = 0.01;
        else this.trietKhau = 0;
        this.tienTrietKhau = Math.round(this.trietKhau*this.donGia*this.soLuong);
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

    @Override
    public int compareTo(LoHang o) {
        return -Long.compare(tienTrietKhau, o.tienTrietKhau);
    }
}
