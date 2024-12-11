package codePTIT.J05077;

public class NhanVien {
    public static long x(String s){
        long y = Long.parseLong(s.substring(1,3));
        if (1<=y && y<=3){
            if(s.charAt(0)=='A') return 10;
            if(s.charAt(0)=='B') return 10;
            if(s.charAt(0)=='C') return 9;
            return 8;
        }
        if(4<=y && y<=8){
            if(s.charAt(0)=='A') return 12;
            if(s.charAt(0)=='B') return 11;
            if(s.charAt(0)=='C') return 10;
            return 9;
        }
        if(9<=y && y<=15){
            if(s.charAt(0)=='A') return 14;
            if(s.charAt(0)=='B') return 13;
            if(s.charAt(0)=='C') return 12;
            return 11;
        }
        if(s.charAt(0)=='A') return 20;
        if(s.charAt(0)=='B') return 16;
        if(s.charAt(0)=='C') return 14;
        return 13;
    }


    private String MNV, ten;
    private long luongCoBan, soNgayCong, luongThang;
    private Phong phong;


    public NhanVien(String MNV, String ten, long luongCoBan, long soNgayCong) {
        this.MNV = MNV;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.luongThang = luongCoBan * soNgayCong * x(MNV) * 1000;
    }
    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public String getMNV() {
        return MNV;
    }

    public String getTen() {
        return ten;
    }
    public long getLuongThang() {
        return luongThang;
    }

    public String toString(){
        return MNV + " " + ten + " " + phong.getTenPhong() + " " + luongThang;
    }
}
