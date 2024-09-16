package codePTIT.J05053;

class DonHang implements Comparable<DonHang>{
    private String MDH, tenHang, loai, thuTu;
    private int soLuong;
    private long donGia, giamGia, thanhTien;

    public DonHang(String loai, String tenHang, String MDH, int soLuong, long donGia) {
        this.loai = loai;
        this.tenHang = tenHang;
        this.MDH = MDH;
        this.donGia = donGia;
        this.soLuong = soLuong;
        String temp = this.MDH.substring(this.MDH.length()-1);
        if(temp.equals("1")) this.giamGia = Math.round(this.donGia*this.soLuong/10.0*5);
        else this.giamGia = Math.round(this.donGia*this.soLuong/10.0*3);
        this.thanhTien = this.soLuong*this.donGia - this.giamGia;
        this.thuTu = this.MDH.substring(1,4);

    }
    public String toString(){
        return tenHang + " " + loai + " " + MDH + " " + MDH.substring(1,4) + " " + giamGia + " " + thanhTien;
    }

    @Override
    public int compareTo(DonHang o) {
        return thuTu.compareTo(o.thuTu);
    }
}
