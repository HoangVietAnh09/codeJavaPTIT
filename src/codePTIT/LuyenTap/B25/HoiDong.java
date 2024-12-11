package codePTIT.LuyenTap.B25;

import java.util.Collections;

public class HoiDong implements Comparable<HoiDong> {
    private String MSV, MDT, MHD;
    private SinhVien sinhVien;
    public HoiDong(String MSV, String MDT, String MHD) {
        this.MSV = MSV;
        this.MDT = MDT;
        this.MHD = MHD;
    }
    public void setSinhVien(SinhVien sinhVien){
        this.sinhVien = sinhVien;
    }

    public String getMSV() {
        return MSV;
    }

    public String getMDT() {
        return MDT;
    }

    public String getMHD() {
        return MHD;
    }

    public String toString(){
        return sinhVien.getMSV() + " " + sinhVien.getHoTen() + " " + sinhVien.getDeTai().getTenDeTai() + " " + sinhVien.getDeTai().getGiangVien();
    }

    @Override
    public int compareTo(HoiDong o) {
        return MSV.compareTo(o.MSV);
    }
}
