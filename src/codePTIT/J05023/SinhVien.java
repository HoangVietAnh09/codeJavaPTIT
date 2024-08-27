package codePTIT.J05023;

class SinhVien {
    private String MSV, hoTen, lop, email;

    public SinhVien(String MSV, String hoTen, String lop, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getLop(){
        return lop;
    }

    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + email;
    }
}

