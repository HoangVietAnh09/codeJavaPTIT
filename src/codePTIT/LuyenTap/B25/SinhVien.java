package codePTIT.LuyenTap.B25;

public class SinhVien {
    private String MSV, hoTen, sdt, email;
    private DeTai deTai;
    public SinhVien(){

    }
    public SinhVien(String MSV, String hoTen, String sdt, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }
    public void setDeTai(DeTai deTai) {
        this.deTai = deTai;
    }
    public DeTai getDeTai(){
        return deTai;
    }

    public String getMSV() {
        return MSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return MSV + " " + hoTen + " " + sdt + " " + email + " " + deTai.getTenDeTai() + " " + deTai.getGiangVien();
    }
}
