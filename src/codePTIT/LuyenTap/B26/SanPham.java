package codePTIT.LuyenTap.B26;

public class SanPham {
    private String MSP, tenSanPham;
    private long giaBan, baoHanh;

    public SanPham(String MSP, String tenSanPham, long giaBan, long baoHanh){
        this.MSP = MSP;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;

    }
    public String getMSP() {
        return MSP;
    }

    public long getGiaBan(){
        return giaBan;
    }

    public long getBaoHanh(){
        return baoHanh;
    }
}
