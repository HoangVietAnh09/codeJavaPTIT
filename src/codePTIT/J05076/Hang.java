package codePTIT.J05076;

public class Hang {
    private String ma, ten, xepLoai;
    private double lai, tongNhap, tongXuat;
    private ThongKe thongKe;

    public Hang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
        switch (this.xepLoai){
            case "A":
                this.lai = 0.08;
                break;
            case "B":
                this.lai = 0.05;
                break;
            default:
                this.lai = 0.02;
        }
    }
    public long getTongNhap(){
        return thongKe.getSoLuongNhap() * thongKe.getDonGiaNhap();
    }
    public long getTongXuat(){
        return (long) (thongKe.getDonGiaNhap() * (lai + 1.0) * thongKe.getSoLuongXuat());
    }
    public void setThongKe(ThongKe thongKe) {
        this.thongKe = thongKe;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getXepLoai() {
        return xepLoai;
    }
    public String toString(){
        return ma + " " + ten + " " + getTongNhap() + " " + getTongXuat();
    }

}
