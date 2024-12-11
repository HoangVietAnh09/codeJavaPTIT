package codePTIT.J05070;


public class TranDau implements Comparable<TranDau>{
    public static int cnt = 1;
    private String MTD;
    private long soCoDongVien, doanhThu;
    private Doi doi;

    public TranDau(String MTD, long soCoDongVien) {
        this.MTD = MTD;
        this.soCoDongVien = soCoDongVien;
    }
    public String getMTD(){
        return this.MTD;
    }
    public void setMTD(String MTD) {
        this.MTD = MTD;
    }
    public void setDoi(Doi doi) {
        this.doi = doi;
    }
    public String toString(){
        return MTD + " " + doi.getTen() + " " + soCoDongVien * doi.getGiaVe();
    }

    @Override
    public int compareTo(TranDau o) {
        if(soCoDongVien*doi.getGiaVe() == o.soCoDongVien*o.doi.getGiaVe()){
            return doi.getTen().compareTo(o.doi.getTen());
        }
        return -Long.compare(soCoDongVien*doi.getGiaVe(), o.soCoDongVien*o.doi.getGiaVe());
    }
}
