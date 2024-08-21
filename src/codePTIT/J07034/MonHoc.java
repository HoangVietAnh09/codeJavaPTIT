package codePTIT.J07034;

class MonHoc implements Comparable<MonHoc>{
    private String MMH, ten;
    private int tin;
    public MonHoc(String MMH, String ten, int tin) {
        this.MMH = MMH;
        this.ten = ten;
        this.tin = tin;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ten.compareTo(o.ten);
    }
    public String toString(){
        return MMH + " " + ten + " " + tin;
    }
}
