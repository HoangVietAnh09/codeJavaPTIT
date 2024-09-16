package codePTIT.J05042;

class SinhVien implements Comparable<SinhVien>{
    private String hoTen;
    private int soBaiDung, tongSub, thuHang;

    public SinhVien(String hoTen, int soBaiDung, int tongSub) {
        this.hoTen = hoTen;
        this.soBaiDung = soBaiDung;
        this.tongSub = tongSub;
    }

    public void setThuHang(int thuHang){
        this.thuHang = thuHang;
    }


    @Override
    public int compareTo(SinhVien o) {
        if(soBaiDung == o.soBaiDung){
            if(tongSub == o.tongSub){
                return hoTen.compareTo(o.hoTen);
            }
            return tongSub - o.tongSub;
        }
        return o.soBaiDung - soBaiDung;
    }
    public String toString(){
        return hoTen + " " + soBaiDung + " " + tongSub;
    }
}
