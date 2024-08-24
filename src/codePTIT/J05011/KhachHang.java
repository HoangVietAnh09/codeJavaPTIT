package codePTIT.J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class KhachHang implements Comparable<KhachHang>{
    private String MKH, hoTen, gioVao, gioRa;
    private long thoiGian;

    public KhachHang(String MKH, String hoTen, String gioVao, String gioRa) throws ParseException {
        this.MKH = MKH;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.thoiGian = (sdf.parse(this.gioRa).getTime() - sdf.parse(this.gioVao).getTime()) / 1000;
    }


    @Override
    public int compareTo(KhachHang o) {
        return -Long.compare(this.thoiGian, o.thoiGian);
    }

    public String toString(){
        return MKH + " " + hoTen + " " + thoiGian/3600 + " gio " + thoiGian/60%60 + " phut";
    }
}
