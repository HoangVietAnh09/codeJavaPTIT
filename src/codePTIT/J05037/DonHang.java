package codePTIT.J05037;

class DonHang implements Comparable<DonHang>{
    public static int cnt = 1;
    private String MDH, tenHang, donVi;
    private long donGia, soLuong, phiVanChuyen, thanhTien, giaBan;

    public DonHang(String tenHang, String donVi, long donGia, long soLuong) {
        this.MDH = "MH" + String.format("%02d", cnt++);
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.phiVanChuyen = Math.round(this.soLuong * this.donGia * 0.05);
        this.thanhTien = this.donGia * this.soLuong + this.phiVanChuyen;
        this.giaBan = Math.round((this.thanhTien + this.thanhTien * 0.02)/this.soLuong);
        if(this.giaBan%100 != 0) this.giaBan = this.giaBan + (100 - this.giaBan%100);
    }

    public String toString(){
        return MDH + " " + tenHang + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }

    @Override
    public int compareTo(DonHang o) {
        return -Long.compare(this.donGia, o.donGia);
    }
}
