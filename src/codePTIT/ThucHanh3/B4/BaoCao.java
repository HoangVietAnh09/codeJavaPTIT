package codePTIT.ThucHanh3.B4;

public class BaoCao {
    private String MSV, thoiGan;

    public BaoCao(String MSV, String thoiGan) {
        this.MSV = MSV;
        this.thoiGan = thoiGan;
    }
    public String getMSV() {
        return MSV;
    }
    public String getThoiGan(){
        return thoiGan;
    }
    public void setThoiGan(String thoiGan){
        this.thoiGan = thoiGan;
    }

}
