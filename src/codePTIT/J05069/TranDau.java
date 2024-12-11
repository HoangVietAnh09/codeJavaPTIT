package codePTIT.J05069;

public class TranDau {
    public static int cnt = 1;
    private String MTD;
    private long soCoDongVien;
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
}
