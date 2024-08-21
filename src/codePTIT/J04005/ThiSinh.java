package codePTIT.J04005;

class ThiSinh {
    private String hoTen, ngaySinh;
    private double m1, m2, m3;
    ThiSinh(String hoTen, String ngaySinh, double m1, double m2, double m3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", this.m1 + this.m2 + this.m3);
    }
}
