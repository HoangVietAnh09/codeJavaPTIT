package codePTIT.ThucHanh;

public class KhachHang implements Comparable<KhachHang>{
    public static int cnt = 1;
    private String MKH, hoTen, diaChi, maSanPham, ngayMua;
    private int soLuong;
    private SanPham sanPham;

    public KhachHang(String hoTen, String diaChi, String maSanPham, int soLuong, String ngayMua, SanPham sanPham) {
        this.MKH = "KH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
        this.sanPham = sanPham;

    }

    public String expire(){
        String[] tmp = ngayMua.split("/");
        int m = Integer.parseInt(tmp[1]) + sanPham.getBaoHanh();
        int y = m/12 + Integer.parseInt(tmp[2]);
        return String.format("%02d", Integer.parseInt(tmp[0])) + "/" + String.format("%02d", m-12) + "/" + y;
    }



    public String toString(){
        return MKH + " " + hoTen + " " + diaChi + " " + maSanPham + " " + soLuong * sanPham.getGia() + " " + expire();
    }

    @Override
    public int compareTo(KhachHang o) {
        if(sanPham.getBaoHanh() == o.sanPham.getBaoHanh()){
            return MKH.compareTo(o.MKH);
        }
        return -Integer.compare(sanPham.getGia(), o.sanPham.getGia());
    }
}
