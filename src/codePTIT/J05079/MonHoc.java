package codePTIT.J05079;



public class MonHoc implements Comparable<MonHoc>{
    private String MMH;
    private LopHoc lopHoc;

    public MonHoc(String MMH) {
        this.MMH = MMH;
    }

    public MonHoc(String MMH, LopHoc lopHoc) {
        this.MMH = MMH;
        this.lopHoc = lopHoc;
    }

    public String getMMH() {
        return MMH;
    }
    public LopHoc getLopHoc() {
        return lopHoc;
    }
    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }
    public String toString(){
        return lopHoc.getNhom() + " " + lopHoc.getGiangVien();
    }


    @Override
    public int compareTo(MonHoc o) {
        return lopHoc.getNhom().compareTo(o.getLopHoc().getNhom());
    }
}
