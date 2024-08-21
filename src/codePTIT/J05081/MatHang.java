package codePTIT.J05081;

class MatHang implements Comparable<MatHang> {
    public static int cnt = 1;
    private String id, ten, donVi;
    private  int giaMua, giaBan, loiIch;
    public MatHang(){
        id = ten = donVi = "";
        giaMua = giaBan = 0;
    }
    public MatHang(String ten, String donVi, int giaMua, int giaBan){
        this.id = "MH" + String.format("%03d", cnt++);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiIch = giaBan - giaMua;
    }
    public int getLoiIch(){
        return this.loiIch;
    }

    @Override
    public int compareTo(MatHang o) {
        return o.getLoiIch() - this.getLoiIch();
    }
    public String toString(){
        return id + " " + ten + " " + giaMua + " " + giaBan + " " + loiIch;
    }
}
