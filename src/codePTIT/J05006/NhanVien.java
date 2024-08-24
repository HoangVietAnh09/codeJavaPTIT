package codePTIT.J05006;

class NhanVien {
    public static int cnt = 1;
    private String MNV, hoTen, gioiTinh, ngaySinh, diaChi, tax, ngayKiHopDong;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String tax, String ngayKiHopDong){
        this.MNV = String.format("%05d", cnt++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tax = tax;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public String toString(){
        return MNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + tax + " " + ngayKiHopDong;
    }
}
