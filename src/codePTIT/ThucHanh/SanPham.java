package codePTIT.ThucHanh;

public class SanPham {
    private String MSP, ten;
    private int gia, baoHanh;

    public SanPham(String MSP, String ten, int gia, int baoHanh) {
        this.MSP = MSP;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }
    public String getMSP(){
        return MSP;
    }
    public int getGia() {
        return gia;
    }

    public int getBaoHanh() {
        return baoHanh;
    }
}
