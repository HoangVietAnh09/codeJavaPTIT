package codePTIT.J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class NhanVien implements Comparable<NhanVien>{
    public static int cnt = 1;
    private String MNV, hoTen, gioiTinh, ngaySinh, diaChi, tax, ngayKiHopDong;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String tax, String ngayKiHopDong) throws ParseException {
        this.MNV = String.format("%05d", cnt++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tax = tax;
        this.ngayKiHopDong = ngayKiHopDong;
    }
    public Date changeToDate(){
        Date date = new Date(ngaySinh);
        return date;
    }

    @Override
    public int compareTo(NhanVien o) {
        return changeToDate().compareTo(o.changeToDate());
    }
    public String toString(){
        return MNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + tax + " " + ngayKiHopDong;
    }
}
