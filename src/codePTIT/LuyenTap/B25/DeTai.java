package codePTIT.LuyenTap.B25;

public class DeTai {
    public static int cnt = 1;
    private String MDT, giangVien, tenDeTai;

    public DeTai(String giangVien, String tenDeTai) {
        this.MDT = "DT" + String.format("%03d", cnt++);
        this.giangVien = giangVien;
        this.tenDeTai = tenDeTai;
    }

    public String getMDT() {
        return MDT;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    @Override
    public String toString() {
        return MDT + " " + giangVien + " " + tenDeTai;
    }
}
