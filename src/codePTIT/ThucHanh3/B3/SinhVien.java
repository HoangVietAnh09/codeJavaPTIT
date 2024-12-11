package codePTIT.ThucHanh3.B3;

public class SinhVien implements Comparable<SinhVien>{
    private String MSV, hoTen, lop, email, sdt;

    public SinhVien(String MSV, String hoTen, String lop, String email, String sdt) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }


    @Override
    public int compareTo(SinhVien o) {
        if(lop.equals(o.lop)) return MSV.compareTo(o.MSV);
        return lop.compareTo(o.lop);
    }

    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + email + " " + sdt;
    }
}
