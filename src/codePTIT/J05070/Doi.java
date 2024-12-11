package codePTIT.J05070;

public class Doi {
    private String ma, ten;
    private long giaVe;

    public Doi(String ma, String ten, long giaVe) {
        this.ma = ma;
        this.ten = ten;
        this.giaVe = giaVe;
    }

    public String getTen(){
        return ten;
    }
    public long getGiaVe(){
        return giaVe;
    }
    public String getMa(){
        return ma;
    }

}
