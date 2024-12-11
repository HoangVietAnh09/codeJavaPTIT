package codePTIT.ThucHanh;

public class SinhVien implements Comparable<SinhVien>{
    private String MSV, hoTen, lop, email, sdt, gioiTinh, size;

    public SinhVien(String MSV, String hoTen, String lop, String email, String sdt, String gioiTinh) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public String getMSV(){
        return this.MSV;
    }

    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + email + " " + sdt;
    }


    @Override
    public int compareTo(SinhVien o) {
        return this.MSV.compareTo(o.MSV);
    }
}
