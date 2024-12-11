package codePTIT.J07074;

public class MonHoc implements Comparable<MonHoc>{
    private String MMH, tenMon;
    private int soTin;
    private LopHoc lopHoc;
    public MonHoc(String MMH, String tenMon, int soTin) {
        this.MMH = MMH;
        this.tenMon = tenMon;
        this.soTin = soTin;
    }
    public MonHoc(String MMH, String tenMon, int soTin, LopHoc lopHoc) {
        this.MMH = MMH;
        this.tenMon = tenMon;
        this.soTin = soTin;
        this.lopHoc = lopHoc;
    }
    public int getSoTin(){
        return soTin;
    }
    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getMMH(){
        return MMH;
    }

    public String getTenMonHoc(){
        return tenMon;
    }

    public String toString(){
        return lopHoc.getMN() + " " + lopHoc.getNgaygiang() + " " + lopHoc.getKipGiang() + " " + lopHoc.getHoTenGiangVien() + " " + lopHoc.getPhongHoc();
    }


    @Override
    public int compareTo(MonHoc o) {
        if(lopHoc.getNgaygiang() == o.lopHoc.getNgaygiang()){
            if(lopHoc.getKipGiang() == o.lopHoc.getKipGiang()){
                return lopHoc.getHoTenGiangVien().compareTo(o.lopHoc.getHoTenGiangVien());
            }
            return Integer.compare(lopHoc.getKipGiang(), o.lopHoc.getKipGiang());
        }
        return Integer.compare(lopHoc.getNgaygiang(), o.lopHoc.getNgaygiang());
    }
}
