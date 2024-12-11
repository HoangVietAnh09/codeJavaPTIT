package codePTIT.J05057;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

class ThiSinh {
    private String MTS, hoTen, trangThai;
    private double toan, ly, hoa, uuTien, tongDiem;
    Map<String, Double> map = new HashMap<>();

    public ThiSinh(String MTS, String hoTen, double toan, double ly, double hoa) {
        this.MTS = MTS;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(this.MTS.substring(0,3).equals("KV1")) this.uuTien = 0.5;
        else if(this.MTS.substring(0,3).equals("KV2")) this.uuTien = 1.0;
        else this.uuTien = 2.5;
        this.tongDiem = this.toan*2 + this.ly + this.hoa;
        if(this.tongDiem + this.uuTien >= 24.0){
            this.trangThai = "TRUNG TUYEN";
        }else{
            this.trangThai = "TRUOT";
        }
    }

    public String fm(double tongDiem){
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(tongDiem);

    }

    public String toString(){
        return MTS + " " + hoTen + " " + fm(uuTien) + " " + fm(tongDiem) + " " + trangThai;
    }

}
