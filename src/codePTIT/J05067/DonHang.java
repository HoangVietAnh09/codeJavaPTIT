package codePTIT.J05067;

public class DonHang {
    private String MDH, hangSanXuat;
    private long soLuong, donGia, thue, thanhTien;

    public DonHang(String MDH, long soLuong) {
        this.MDH = MDH;
        this.soLuong = soLuong;
        String tmp = MDH.substring(MDH.length() - 2, MDH.length());
        if(tmp.equals("BP")) this.hangSanXuat = "British Petro";
        else if(tmp.equals("ES")) this.hangSanXuat = "Esso";
        else if(tmp.equals("SH")) this.hangSanXuat = "Shell";
        else if(tmp.equals("CA")) this.hangSanXuat = "Castrol";
        else if(tmp.equals("MO")) this.hangSanXuat = "Mobil";
        else this.hangSanXuat = "Trong Nuoc";
        String tmp2 = MDH.substring(0, 1);
        if(tmp2.equals("X")){
            this.donGia = 128000;
            this.thue = !tmp.equals("TN") ? (long) (this.donGia * this.soLuong * 0.03) : 0;
        }else if(tmp2.equals("D")){
            this.donGia = 11200;
            this.thue = !tmp.equals("TN") ? (long) (this.donGia * this.soLuong * 0.035) : 0;
        }else{
            this.donGia = 9700;
            this.thue = !tmp.equals("TN") ? (long) (this.donGia * this.soLuong * 0.02) : 0;
        }
        this.thanhTien = this.donGia * this.soLuong + this.thue;

    }
    public String toString(){
        return MDH + " " + hangSanXuat + " " + donGia + " " + thue + " " + thanhTien;
    }
}
