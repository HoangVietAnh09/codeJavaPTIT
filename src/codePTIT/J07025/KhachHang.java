package codePTIT.J07025;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang>{
    public static int cnt = 1;
    private String MKH, tenKhachHang, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.MKH = String.format("KH%03d", cnt++);
        String tmp = "";
        String[] words = tenKhachHang.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            tmp += words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
        }
        this.tenKhachHang = tmp.trim();
        this.gioiTinh = gioiTinh;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = sdf.format(sdf.parse(ngaySinh));
        this.diaChi = diaChi;
    }

    public String toString(){
        return MKH + " " + tenKhachHang + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }


    @Override
    public int compareTo(KhachHang o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return Long.compare(sdf.parse(ngaySinh).getTime(), sdf.parse(o.ngaySinh).getTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
