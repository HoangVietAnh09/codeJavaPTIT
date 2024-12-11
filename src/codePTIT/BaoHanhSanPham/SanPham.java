package codePTIT.BaoHanhSanPham;

public class SanPham {
    private String msp, ten;
    private long gia, baoHanh;

    public SanPham(String msp, String ten, long gia, long baoHanh) {
        this.msp = msp;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    public long getGia(){
        return gia;
    }

    public long getBaoHanh(){
        return baoHanh;
    }

    public String getMsp(){
        return msp;
    }

}
