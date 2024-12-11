package codePTIT.J05074;

public class SinhVien {
    private String MSV, hoTen, lop;
    private DiemDanh diemDanh;

    public SinhVien(String MSV, String hoTen, String lop) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }
    public void setDiemDanh(DiemDanh diemDanh) {
        this.diemDanh = diemDanh;
    }
    public String getMSV() {
        return MSV;
    }
    public String toString(){
        if(diemDanh.getDiem() == 0){
            return MSV + " " + hoTen + " " + lop + " " + diemDanh.getDiem() + " " + "KDDK";
        }
        return MSV + " " + hoTen + " " + lop + " " + diemDanh.getDiem();
    }

}
