package codePTIT.J04013;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

class ThiSinh {
    private String MTS, hoTen, trangThai;
    private double toan, ly, hoa, tongDiem, uuTien;
    Map<String, Double> map = new HashMap<>();
    public ThiSinh(String MTS, String hoTen, double toan, double ly, double hoa){
        this.MTS = MTS;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        map.put("KV1", 0.5);
        map.put("KV2", 1.0);
        map.put("KV3", 2.5);
        this.uuTien = map.get(this.MTS.substring(0,3));
        this.tongDiem = this.toan*2 + this.ly + this.hoa;
        if(this.tongDiem + this.uuTien >= 24.0) this.trangThai = "TRUNG TUYEN";
        else this.trangThai = "TRUOT";
    }
    public String format(double diem){
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(diem);
    }
    public String toString(){
        return MTS + " " + hoTen + " " + format(uuTien) + " " + format(tongDiem) + " " + trangThai;
    }
}
