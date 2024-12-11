package codePTIT.BaoHanhSanPham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    public static int cnt = 1;
    private SanPham sanPham;
    private String mkh;
    private String hoTen;
    private String diaChi;
    private String msp;
    private String ngayHetHan;
    private String ngayMua;
    private long soLuong, tongTien;
    private Date thoiGian;

    public KhachHang(String hoTen, String diaChi, SanPham sanPham, int soLuong, String ngayMua) throws ParseException {
        this.sanPham = sanPham;
        this.mkh = "KH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
        this.tongTien = soLuong * sanPham.getGia();
        String[] tmp = ngayMua.split("/");
        Long thang = Long.parseLong(tmp[1]);
        Long nam = Long.parseLong(tmp[2]);
        thang += sanPham.getBaoHanh();
        nam += thang/12;
        thang %= 12;
        if(thang == 0){
            thang = (long)12;
            nam--;
        }
        this.ngayHetHan = String.format("%s/%02d/%04d", tmp[0], thang, nam);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.thoiGian = sdf.parse(this.ngayHetHan);

    }
    public String toString(){
        return mkh + " " + hoTen + " " + diaChi + " " + sanPham.getMsp() + " " + tongTien + " " + ngayHetHan;
    }


    @Override
    public int compareTo(KhachHang o) {
        if(this.thoiGian == o.thoiGian) return this.mkh.compareTo(o.mkh);
        return this.thoiGian.compareTo(o.thoiGian);
    }
}
