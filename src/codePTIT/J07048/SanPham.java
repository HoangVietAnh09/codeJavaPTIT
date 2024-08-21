package codePTIT.J07048;

class SanPham implements Comparable<SanPham>{
    private String MSP, ten;
    private int gia, baoHanh;
    public SanPham(String MSP, String ten, int gia, int baoHanh) {
        this.MSP = MSP;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }


    @Override
    public int compareTo(SanPham o) {
        if(gia == o.gia) return MSP.compareTo(o.MSP);
        return gia < o.gia ? 1 : -1;
    }

    public String toString(){
        return MSP + " " + ten + " " + gia + " " + baoHanh;
    }
}
