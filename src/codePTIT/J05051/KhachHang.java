package codePTIT.J05051;

class KhachHang implements Comparable<KhachHang>{
    public static int cnt = 1;
    private String MKH, LSD;
    private long heSo, soCu, soMoi, thanhTien, phuTroi, tongTien;

    public KhachHang(String LSD, long soCu, long soMoi){
        this.MKH = "KH" + String.format("%02d", cnt++);
        this.LSD = LSD;
        this.soCu = soCu;
        this.soMoi = soMoi;
        if(this.LSD.equals("KD")){
            this.heSo = 3;
        }else if(this.LSD.equals("NN")){
            this.heSo = 5;
        }else if(this.LSD.equals("TT")){
            this.heSo = 4;
        }else{
            this.heSo = 2;
        }
        this.thanhTien = (this.soMoi - this.soCu) * this.heSo * 550;
        if(this.soMoi - this.soCu < 50) this.phuTroi = 0;
        else if(this.soMoi - this.soCu <= 100) this.phuTroi = Math.round(this.thanhTien/100.0*35);
        else this.phuTroi = this.thanhTien;
        this.tongTien = this.phuTroi + this.thanhTien;
    }

    public String toString(){
        return MKH + " " + heSo + " " + thanhTien + " " + phuTroi + " " + tongTien;
    }

    @Override
    public int compareTo(KhachHang o) {
        return -Long.compare(tongTien, o.tongTien);
    }
}