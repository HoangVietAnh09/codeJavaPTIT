package codePTIT.J05080;

public class LopHoc implements Comparable<LopHoc>{
    private String MLH, ten, nhom, giangVien;
    private MonHoc monHoc;

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

    public String toString(){
        return MLH + " " + ten + " " + nhom;
    }

    @Override
    public int compareTo(LopHoc o) {
        if(MLH.compareTo(o.MLH)==0){
            return nhom.compareTo(o.nhom);
        }
        return MLH.compareTo(o.MLH);
    }
}
