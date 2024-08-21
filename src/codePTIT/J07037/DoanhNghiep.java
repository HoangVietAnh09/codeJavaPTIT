package codePTIT.J07037;

class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String MDN, ten;
    private int soSinhVien;
    public DoanhNghiep() {
        MDN = ten = "";
        soSinhVien = 0;
    }
    public DoanhNghiep(String mdn, String ten, int soSinhVien) {
        this.MDN = mdn;
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return MDN.compareTo(o.MDN);
    }

    public String toString(){
        return MDN + " " + ten + " " + soSinhVien;
    }


}
