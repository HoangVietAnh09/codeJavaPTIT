package codePTIT.DanhSachLienLac;

class SinhVien implements Comparable<SinhVien>{
    private String msv, hoTen, lop, email, sdt;

    public SinhVien(String msv, String hoTen, String lop, String email, String sdt) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public String toString(){
        return msv + " " + hoTen + " " + lop + " " + email + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)) return this.msv.compareTo(o.msv);
        return this.lop.compareTo(o.lop);
    }
}
