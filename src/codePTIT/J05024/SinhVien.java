package codePTIT.J05024;

class SinhVien {
    private String MSV, hoTen, lop, email;

    public SinhVien(String MSV, String hoTen, String lop, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    public String getMSV() {
        return MSV;
    }
    public String getLop(){
        return lop;
    }
    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + email;
    }
}
