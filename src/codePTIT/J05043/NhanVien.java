package codePTIT.J05043;

class NhanVien {
    public static int cnt = 1;
    private String MNV, hoTen, chucVu;
    private int soNgayCong, luongCoBan, phuCap, tamUng;

    public NhanVien(String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
        this.MNV = String.format("NV%02d", cnt++);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        if(this.chucVu.equals("GD")) this.phuCap = 500;
        else if(this.chucVu.equals("PGD")) this.phuCap = 400;
        else if(this.chucVu.equals("TP")) this.phuCap = 300;
        else if(this.chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        if((double)(this.luongCoBan*this.soNgayCong + this.phuCap)*2/3 < 25000){
            this.tamUng = (int)Math.round((double)(this.luongCoBan*this.soNgayCong+this.phuCap)*2/3/1000)*1000;
        }else{
            this.tamUng = 25000;
        }
    }
    public String toString(){
        return MNV + " " + hoTen + " " + phuCap + " " + luongCoBan*soNgayCong + " " + tamUng + " " + (luongCoBan*soNgayCong+phuCap-tamUng);
    }

}
