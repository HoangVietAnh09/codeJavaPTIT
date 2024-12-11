package codePTIT.ThucTapCoSo;

public class SinhVien implements Comparable<SinhVien>{
    private String msv, hoTen, sdt, email;
    private DeTai deTai;

    public SinhVien(String msv, String hoTen, String sdt, String email) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public void setDeTai(DeTai deTai) {
        this.deTai = deTai;
    }
    public String toString(){
        return msv + " " + hoTen + " " + sdt + " " + email + " " + deTai.getTenGiangVien() + " " + deTai.getTenDeTai();
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.deTai.getTenDeTai().compareTo(o.deTai.getTenDeTai());
    }
}
