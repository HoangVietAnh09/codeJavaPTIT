package codePTIT.J06004;

public class SinhVien implements Comparable<SinhVien>{
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
        return MSV + " " + hoTen + " " + sdt + " " + thuTu;
    }


    @Override
    public int compareTo(SinhVien o) {
        return this.MSV.compareTo(o.MSV);
    }
}
