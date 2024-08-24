package codePTIT.J07055;

class SinhVien implements Comparable<SinhVien>{
    public static int cnt = 1;
    private String MSV, hoTen, xepLoai;
    private double luyenTap, thucHanh, Thi, dtb;

    public SinhVien(String hoTen, double luyenTap, double thucHanh, double thi) {
        this.MSV = "SV" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.luyenTap = luyenTap;
        this.thucHanh = thucHanh;
        this.Thi = thi;
        this.dtb = this.luyenTap*25/100 + thucHanh*35/100 + thi*40/100;
        if(this.dtb >= 8){
            this.xepLoai = "GIOI";
        }else if(this.dtb >= 6.5){
            this.xepLoai = "KHA";
        }else if(this.dtb >= 5){
            this.xepLoai = "TRUNG BINH";
        }else{
            this.xepLoai = "KEM";
        }
    }
    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
    public String formatHoTen(String s){
        String[] words = s.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }


    @Override
    public int compareTo(SinhVien o) {
        return dtb < o.dtb ? 1 : -1;
    }
    public String toString(){
        return MSV + " " + formatHoTen(hoTen) + " " + String.format("%.2f", dtb) + " " + xepLoai;
    }
}
