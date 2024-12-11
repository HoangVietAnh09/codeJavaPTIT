package codePTIT.LuyenTap.B24;

public class DeTai {
    public static int cnt = 1;
    private String MDT, tenGiangVien, tenDeTai;

    public DeTai(String tenGiangVien, String tenDeTai) {
        this.MDT = "DT" + String.format("%03d", cnt++);
        this.tenGiangVien = tenGiangVien;
        this.tenDeTai = tenDeTai;
    }

    public String getMDT() {
        return MDT;
    }
    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

}
