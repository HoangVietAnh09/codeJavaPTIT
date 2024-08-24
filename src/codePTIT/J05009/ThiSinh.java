package codePTIT.J05009;

class ThiSinh implements Comparable<ThiSinh>{
    public static int cnt = 1;
    private String MSV, hoTen, ngaySinh;
    private double diem1, diem2, diem3, diemTong;

    public ThiSinh(String hoTen, String ngaySinh, double diem1, double diem2, double diem3) {
        this.MSV = String.format("%d", cnt++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTong = this.diem1 + this.diem2 + this.diem3 + this.diemTong;
    }

    public double getDiemTong(){
        return diemTong;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(diemTong == o.diemTong) return MSV.compareTo(o.MSV);
        return diemTong < o.diemTong ? 1 : -1;
    }

    public String toString(){
        return MSV + " " + hoTen + " " + ngaySinh + " " + diemTong;
    }
}
