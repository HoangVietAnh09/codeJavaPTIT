package codePTIT.LuyenTap.B26;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KhachHang implements Comparable<KhachHang>{
    public static int cnt = 1;
    private String MKH, hoTen, diaChi, MSP, ngayMua;
    private long soLuong;
    private SanPham sanPham;

    public KhachHang(String hoTen, String diaChi, String MSP, long soLuong, String ngayMua) {
        this.MKH = "KH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.MSP = MSP;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;

    }
    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    public String getMSP(){
        return MSP;
    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(sdf.parse(ngayMua));
            calendar.add(Calendar.MONTH, (int) sanPham.getBaoHanh());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String hetHan = sdf.format(calendar.getTime());
        return MKH + " " + hoTen + " " + diaChi + " " + MSP + " " + sanPham.getGiaBan() * soLuong + " " +  hetHan;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(sanPham.getBaoHanh(), o.sanPham.getBaoHanh());
    }
}
