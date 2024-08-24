package codePTIT.J05010;

class MatHang implements Comparable<MatHang>{
    public static int cnt = 1;
    private String MMH, ten, nhom;
    private double giaMua, giaBan, loiNhuan;

    public MatHang(String ten, String nhom, double giaMua, double giaBan) {
        this.MMH = String.format("%d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
        return -Double.compare(this.loiNhuan, o.loiNhuan);
    }

    public String toString(){
        return MMH + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
