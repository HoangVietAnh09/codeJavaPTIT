package codePTIT.LuyenTap.B24;

public class SinhVien implements Comparable<SinhVien>{
    private String MSV, hoTen, sdt, email;
    private DeTai deTai;
    public SinhVien(String MSV, String hoTen, String sdt, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMSV(){
        return MSV;
    }
    public void setDeTai(DeTai deTai){
        this.deTai = deTai;
    }

    public String toString(){
        return MSV + " " + hoTen + " " + sdt + " " + email + " " + deTai.getTenGiangVien() + " " + deTai.getTenDeTai();
    }

    @Override
    public int compareTo(SinhVien o) {
        return deTai.getTenDeTai().compareTo(o.deTai.getTenDeTai());
    }
}
