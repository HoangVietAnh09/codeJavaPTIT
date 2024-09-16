package codePTIT.J05054;

class HocSinh implements Comparable<HocSinh>{
    public static int cnt = 1;
    private String MHS, hoTen, xepLoai;
    private double diemTrungBinh;
    private int thuTu;

    public HocSinh(String hoTen, double diemTrungBinh) {
        this.MHS = "HS" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
        if(this.diemTrungBinh >= 9) this.xepLoai = "Gioi";
        else if(this.diemTrungBinh >= 7) this.xepLoai = "Kha";
        else if(this.diemTrungBinh >= 5) this.xepLoai = "Trung Binh";
        else this.xepLoai = "Yeu";
    }

    public void setThuTu(int thuTu){
        this.thuTu = thuTu;
    }

    public double getDiemTrungBinh(){
        return this.diemTrungBinh;
    }

    public String toString(){
        return MHS + " " + hoTen + " " + String.format("%.1f", diemTrungBinh) + " " + xepLoai + " " + thuTu;
    }

    @Override
    public int compareTo(HocSinh o) {
        return Double.compare(this.diemTrungBinh, o.diemTrungBinh);
    }
}
