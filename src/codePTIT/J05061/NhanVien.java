package codePTIT.J05061;

public class NhanVien implements Comparable<NhanVien>{
    public static int cnt = 1;
    private String MNV, hoTen, ngaySinh, xepLoai;
    private double lyThuyet, thucHanh, diemThuong, diemXepLoai;
    private int tuoi;

    public NhanVien(String hoTen, String ngaySinh, double lyThuyet, double thucHanh) {
        this.MNV = String.format("PH%02d", cnt++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        if(this.lyThuyet >= 8 && this.thucHanh >= 8) this.diemThuong = 1.0;
        else if(this.lyThuyet >= 7.5 && this.thucHanh >= 7.5) this.diemThuong = 0.5;
        else this.diemThuong = 0.0;
        this.diemXepLoai = (this.thucHanh + this.lyThuyet)/2 + this.diemThuong;
        if(this.diemXepLoai > 10.0) this.diemXepLoai = 10.0;
        else this.diemXepLoai = Math.round(this.diemXepLoai);
        this.tuoi = 2021 - Integer.parseInt(this.ngaySinh.split("/")[2]);
        if(this.diemXepLoai >= 9) this.xepLoai = "Xuat sac";
        else if(this.diemXepLoai >= 8) this.xepLoai = "Gioi";
        else if(this.diemXepLoai >= 7) this.xepLoai = "Kha";
        else if(this.diemXepLoai >= 5) this.xepLoai = "Trung binh";
        else this.xepLoai = "Truot";
    }

    public String toString(){
        return MNV + " " + hoTen + " " + tuoi + " " + Math.round(diemXepLoai) + " " + xepLoai;
    }

    @Override
    public int compareTo(NhanVien o) {
        return -Double.compare(this.diemXepLoai, o.diemXepLoai);
    }
}
