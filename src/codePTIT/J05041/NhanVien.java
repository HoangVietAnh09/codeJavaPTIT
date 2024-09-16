package codePTIT.J05041;

class NhanVien implements Comparable<NhanVien>{
    public static int cnt = 1;
    private String MNV, hoTen, chucVu;
    private long luongNgay, soNgayCong, luongThang, thuong, phuCap, thucLinh;

    public NhanVien(String hoTen, String chucVu, long luongNgay, long soNGayCong) {
        this.MNV = "NV" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNGayCong;
        this.luongThang = this.luongNgay * this.soNgayCong;
        if(this.soNgayCong >= 25) this.thuong = Math.round(this.luongThang * 0.2);
        else if(this.soNgayCong >= 22) this.thuong = Math.round(this.luongThang * 0.1);
        else this.thuong = 0;
        if(this.chucVu.equals("GD")) this.phuCap = 250000;
        else if(this.chucVu.equals("PGD")) this.phuCap = 200000;
        else if(this.chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        this.thucLinh = luongThang + thuong + phuCap;
    }
    public String toString(){
        return MNV + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thucLinh;
    }

    @Override
    public int compareTo(NhanVien o) {
        return -Long.compare(thucLinh, o.thucLinh);
    }
}
