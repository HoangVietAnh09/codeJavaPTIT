package codePTIT.ThucHanh3.B4;

public class SinhVien {
    private String MSV, hoTen, deTai;
    private BaoCao baoCao;

    public SinhVien(String MSV, String hoTen, String deTai) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.deTai = deTai;
    }
    public String getMSV() {
        return MSV;
    }
    public void setBaoCao(BaoCao baoCao) {
        this.baoCao = baoCao;
    }
    public BaoCao getBaoCao(){
        return baoCao;
    }
    public String toString(){
        return MSV + " " + hoTen + " " + deTai + " " + baoCao.getThoiGan();
    }

}
