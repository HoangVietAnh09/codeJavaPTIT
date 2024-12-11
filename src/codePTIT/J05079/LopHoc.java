package codePTIT.J05079;

public class LopHoc {
    private String MLH, ten, nhom, giangVien;

    public LopHoc(String MLH, String ten, String nhom, String giangVien) {
        this.MLH = MLH;
        this.ten = ten;
        this.nhom = nhom;
        this.giangVien = giangVien;

    }
    public String getNhom(){
        return nhom;
    }

    public String getGiangVien(){
        return giangVien;
    }

    public String getMLH() {
        return MLH;
    }

    public String getTen(){
        return ten;
    }

}
