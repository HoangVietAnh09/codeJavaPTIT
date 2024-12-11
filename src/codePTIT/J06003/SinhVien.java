package codePTIT.J06003;

public class SinhVien {
    private String MSV, hoTen, sdt;
    private int thuTu;

    public SinhVien(String MSV, String hoTen, String sdt, int thuTu){
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.thuTu = thuTu;
    }
    public int getThuTu(){
        return thuTu;
    }
    public String toString(){
        return MSV + " " + hoTen + " " + sdt;
    }


}
