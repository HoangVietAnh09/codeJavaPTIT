package codePTIT.J05036;

class DonHang {
    public static int cnt = 1;
    private String MDH, donHang, donVi;
    private long donGia, soLuong, phiVanChuyen, thanhTien, giaBan;

    public DonHang(String donHang, String donVi, long donGia, long soLuong){
        this.MDH = "MH" + String.format("%02d", cnt++);
        this.donHang = donHang;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.phiVanChuyen = Math.round((double) this.donGia * this.soLuong * 0.05);
        this.thanhTien = this.donGia * this.soLuong + this.phiVanChuyen;
        this.giaBan = this.thanhTien + Math.round((double) this.thanhTien * 0.02);
    }

    public String toString(){
        return MDH + " " + donHang + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }

}
