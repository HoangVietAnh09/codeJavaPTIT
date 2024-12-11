package codePTIT.J05055;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class VanDongVien implements Comparable<VanDongVien>{
    public static int cnt = 1;
    private String MVDV, hoTen, ngaySinh, xuatPhat, denDich, uuTien;
    private int tuoi, rank;
    private long thanhTich, thanhTichThuc;

    public VanDongVien(String hoTen, String ngaySinh, String xuatPhat, String denDich) throws ParseException {
        this.MVDV = "VDV" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.xuatPhat = xuatPhat;
        this.denDich = denDich;
        String[] words = this.ngaySinh.split("/");
        this.tuoi = 2021 - Integer.parseInt(words[2]);
        if(this.tuoi >= 18 && this.tuoi < 25) this.uuTien = "00:00:01";
        else if(this.tuoi >= 25 && this.tuoi < 32) this.uuTien = "00:00:02";
        else if(this.tuoi >= 32) this.uuTien = "00:00:03";
        else this.uuTien = "00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        this.thanhTich = (sdf.parse(denDich).getTime() - sdf.parse(xuatPhat).getTime())/1000;
        this.thanhTichThuc = (sdf.parse(denDich).getTime() - sdf.parse(xuatPhat).getTime() - sdf.parse(uuTien).getTime())/1000;

    }
    public String formatTime(long time){
        long gio = time/3600;
        long phut = (time - gio*3600)/60;
        long giay = time - gio*3600-phut*60;
        return String.format("%02d:%02d:%02d", gio, phut, giay);
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public long getThanhTichThuc(){
        return thanhTichThuc;
    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        return MVDV + " " + hoTen + " " + formatTime(thanhTich) + " " + uuTien + " " + formatTime(thanhTichThuc) + " " + rank;
    }

    @Override
    public int compareTo(VanDongVien o) {

        return -Long.compare(this.thanhTichThuc, o.thanhTichThuc);
    }
}
