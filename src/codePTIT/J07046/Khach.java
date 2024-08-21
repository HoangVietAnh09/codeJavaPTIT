package codePTIT.J07046;

import java.util.Date;

class Khach implements Comparable<Khach>{
    public static int cnt = 1;
    private String MKH, hoTen, maPhong;
    private Date ngayDen, ngayDi;
    private long soNgay;
    public Khach(String hoTen, String maPhong, Date ngayDen, Date ngayDi) {
        this.MKH = "KH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.soNgay = (ngayDi.getTime() - ngayDen.getTime())/(1000 * 60 * 60 * 24)  ;
    }

    public long getSoNgay() {
        return soNgay;
    }


    public String toString(){
        return MKH + " " + hoTen + " " + maPhong + " " + soNgay;
    }

    @Override
    public int compareTo(Khach o) {
        return soNgay < o.soNgay ? 1 : -1;
    }
}
