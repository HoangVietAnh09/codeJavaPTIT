package codePTIT.J05076;

public class ThongKe {
    private String ma;
    private long soLuongNhap, donGiaNhap, soLuongXuat;

    public ThongKe(String ma, long soLuongNhap, long donGiaNhap, long soLuongXuat) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
    }

    public long getSoLuongNhap() {
        return soLuongNhap;
    }

    public long getDonGiaNhap() {
        return donGiaNhap;
    }

    public long getSoLuongXuat() {
        return soLuongXuat;
    }
}
