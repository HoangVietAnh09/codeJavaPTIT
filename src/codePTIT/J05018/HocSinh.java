package codePTIT.J05018;

class HocSinh implements Comparable<HocSinh>{
    public static int cnt = 1;
    private String MHS, hoTen, hocLuc;
    private double toan, tiengViet, ngoaiNgu, vatLy, hoaHoc, sinhHoc, lichSu, dia, giaoDucCongDan, congNghe, tongDiem;

    public HocSinh(String hoTen, double toan, double tiengViet, double ngoaiNgu, double vatLy, double hoaHoc, double sinhHoc, double lichSu, double dia, double giaoDucCongDan, double congNghe) {
        this.MHS = "HS" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.toan = toan;
        this.tiengViet = tiengViet;
        this.ngoaiNgu = ngoaiNgu;
        this.vatLy = vatLy;
        this.hoaHoc = hoaHoc;
        this.sinhHoc = sinhHoc;
        this.lichSu = lichSu;
        this.dia = dia;
        this.giaoDucCongDan = giaoDucCongDan;
        this.congNghe = congNghe;
        this.tongDiem = Math.round((this.toan*2 + this.tiengViet*2 + this.hoaHoc + this.vatLy + this.ngoaiNgu + this.sinhHoc + this.lichSu + this.dia + this.giaoDucCongDan + this.congNghe)/12 * 10f)/10f;
        if(this.tongDiem >= 9) this.hocLuc = "XUAT SAC";
        else if(this.tongDiem >= 8) this.hocLuc = "GIOI";
        else if(this.tongDiem >= 7) this.hocLuc = "KHA";
        else if(this.tongDiem >= 5) this.hocLuc = "TB";
        else this.hocLuc = "YEU";
    }

    @Override
    public int compareTo(HocSinh o) {
        if(tongDiem == o.tongDiem){
            return MHS.compareTo(o.MHS);
        }
        return -Double.compare(this.tongDiem, o.tongDiem);
    }
    public String toString(){
        return MHS + " " + hoTen + " " + String.format("%.1f", tongDiem) + " " + hocLuc;
    }

}
