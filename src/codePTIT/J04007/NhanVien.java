package codePTIT.J04007;

class NhanVien {
    public String MNV, hoTen, gioiTinh, ngaySinh, diaChi, tax, ngayKiHopDong;
    public NhanVien() {
        MNV = hoTen = gioiTinh = ngaySinh = diaChi = tax = ngayKiHopDong = "";
    }
    public NhanVien(String MNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String tax, String ngayKiHopDong){
        this.MNV = MNV;
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

