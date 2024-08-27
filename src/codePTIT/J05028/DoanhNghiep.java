package codePTIT.J05028;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String MDN, ten;
    private int soSinhVien;

    public DoanhNghiep(String MDN, String ten, int soSinhVien) {
        this.MDN = MDN;
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(soSinhVien == o.soSinhVien){
            return MDN.compareTo(o.MDN);
        }
        return -Integer.compare(soSinhVien, o.soSinhVien);
    }

    public String toString(){
        return MDN + " " + ten + " " + soSinhVien;
    }
}
