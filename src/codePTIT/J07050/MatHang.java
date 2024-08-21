package codePTIT.J07050;

class MatHang implements Comparable<MatHang>{
    public static int cnt = 1;
    private String MMH, ten, nhom;
    private double giaMua, giaBan, loiNhuan;

    public MatHang(String ten, String nhom, double giaMua, double giaBan) {
        this.MMH = "MH" + String.format("%02d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan-giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
        return loiNhuan < o.loiNhuan ? 1 : -1;
    }

    public String toString(){
        return MMH + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
