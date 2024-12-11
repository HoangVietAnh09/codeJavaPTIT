package codePTIT.J07074;

public class LopHoc{
    public static int cnt = 1;
    private String MN, MM, hoTenGiangVien, phongHoc;
    private int ngayGiang, kipGiang;


    public LopHoc(String MM, String hoTenGiangVien, String phongHoc, int ngayGiang, int kipGiang) {
        this.MN = String.format("HP%03d", cnt++);
        this.MM = MM;
        this.hoTenGiangVien = hoTenGiangVien;
        this.phongHoc = phongHoc;
        this.ngayGiang = ngayGiang;
        this.kipGiang = kipGiang;
    }
    public String getMM(){
        return MM;
    }
    public String getMN(){
        return MN;
    }

    public int getNgaygiang(){
        return ngayGiang;
    }

    public int getKipGiang(){
        return kipGiang;
    }

    public String getHoTenGiangVien(){
        return hoTenGiangVien;
    }
    public String getPhongHoc(){
        return phongHoc;
    }


}
