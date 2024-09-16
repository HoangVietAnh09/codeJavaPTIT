package codePTIT.J05035;

class SinhVien implements Comparable<SinhVien>{
    public static int cnt = 1;
    private String MSV, hoTen, lop, email, doanhNghiep;
    private int soThuTu;

    public SinhVien(String MSV, String hoTen, String lop, String email, String doanhNghiep){
        this.soThuTu = cnt++;
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getDoanhNghiep(){
        return doanhNghiep;
    }

    public String toString(){
        return soThuTu + " " + MSV + " " + hoTen + " " + lop + " " + email + " " + doanhNghiep;
    }

    @Override
    public int compareTo(SinhVien o) {
        return MSV.compareTo(o.MSV);
    }
}
