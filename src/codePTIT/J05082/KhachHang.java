package codePTIT.J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang>{
    public static int cnt = 1;
    private String MKH, ten, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.MKH = String.format("KH%03d", cnt++);
        String[] words = ten.trim().split("\\s+");
        String tmp = "";
        for(int i = 0; i < words.length; i++){
            if(i != words.length-1){
                tmp += words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
            }else{
                tmp += words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        this.ten = tmp;
        this.gioiTinh = gioiTinh;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = sdf.format(sdf.parse(ngaySinh));
        this.diaChi = diaChi;
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
    public String toString(){
        return MKH + " " + ten + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }
}
