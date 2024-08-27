package codePTIT.J05031;

class BangDiem implements Comparable<BangDiem>{
    private String MSV, hoTen, lop, thuTu;
    private double diem1, diem2, diem3;

    public BangDiem(String MSV, String hoTen, String lop, double diem1, double diem2, double diem3) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public void setThuTu(String thuTu){
        this.thuTu = thuTu;
    }

    @Override
    public int compareTo(BangDiem o) {
        return hoTen.compareTo(o.hoTen);
    }

    public String toString(){
        return thuTu + " " + MSV + " " + hoTen + " " + lop + " " + String.format("%.1f", diem1) + " " + String.format("%.1f", diem2) + " " + String.format("%.1f", diem3);
    }


}
