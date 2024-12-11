package codePTIT.J05064;

public class GiaoVien {
    private String MGV, hoTen, chucVu, heSo;
    private long luongCoBan, phuCap, tong;

    public GiaoVien(String MGV, String hoTen, long luongCoBan) {
        this.MGV = MGV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.chucVu = this.MGV.substring(0,2);
        this.heSo = this.MGV.substring(2);
        if(this.chucVu.equals("HT")) this.phuCap = 2000000;
        else if(this.chucVu.equals("HP")) this.phuCap = 900000;
        else this.phuCap = 500000;
        this.tong = this.luongCoBan * Integer.parseInt(this.heSo) + this.phuCap;
    }
    public String getMGV(){
        return this.MGV;
    }

    public String toString(){
        return MGV + " " + hoTen + " " + Integer.parseInt(heSo) + " " + phuCap + " " + tong;
    }
}
