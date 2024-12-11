package codePTIT.ThucHanh;

public class MonHoc implements Comparable<MonHoc>{
    private String MMH, ten, hinhThuc;

    public MonHoc(String MMH, String ten, String hinhThuc) {
        this.MMH = MMH;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public String getMMH(){
        return MMH;
    }
    @Override
    public int compareTo(MonHoc o) {
        return MMH.compareTo(o.MMH);
    }

    public String toString(){
        return MMH + " " + ten + " " + hinhThuc;
    }
}
