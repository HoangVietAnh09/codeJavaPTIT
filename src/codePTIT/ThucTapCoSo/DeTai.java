package codePTIT.ThucTapCoSo;

public class DeTai {
    public static int cnt = 1;
    private String mdt, tenGiangVien, tenDeTai;

    public DeTai(String tenGiangVien, String tenDeTai) {
        this.mdt = "DT" + String.format("%03d", cnt++);
        this.tenGiangVien = tenGiangVien;
        this.tenDeTai = tenDeTai;
    }

    public String getMdt(){
        return mdt;
    }
    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public String getTenDeTai(){
        return tenDeTai;
    }

}
