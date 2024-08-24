package codePTIT.J07058;

class MonHoc implements Comparable<MonHoc>{
    private String ma, mon, hinhThuc;
    public MonHoc(String ma, String mon, String hinhThuc){
        this.ma = ma;
        this.mon = mon;
        this.hinhThuc = hinhThuc;
    }

    public int compareTo(MonHoc o){
        return this.ma.compareTo(o.ma);
    }

    public String toString(){
        return ma + "\t" + mon + "\t" + hinhThuc;
    }
}
