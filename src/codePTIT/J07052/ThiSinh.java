package codePTIT.J07052;

import java.text.DecimalFormat;
import java.util.HashMap;

class ThiSinh implements Comparable<ThiSinh> {
    private String MTS, hoTen, trangThai;
    private double toan, ly, hoa;
    private HashMap<String, Double> hs = new HashMap<>();
    public ThiSinh(String mts, String hoTen, double toan, double ly, double hoa){
        this.MTS = mts;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        hs.put("KV1", 0.5);
        hs.put("KV2", 1.0);
        hs.put("KV3", 2.5);
    }

    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }
    public String formatName(String hoTen){
        String[] words = hoTen.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public double diemTong(){
        return hs.get(MTS.substring(0,3)) + toan*2 + ly + hoa;
    }

    public String chuanHoa(double diem){
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(diem);
    }


    @Override
    public int compareTo(ThiSinh o) {
        if(diemTong() == o.diemTong()){
            return MTS.compareTo(o.MTS);
        }
        return diemTong() < o.diemTong() ? 1 : -1;
    }

    public String toString(){
        return MTS + " " + formatName(hoTen) + " " + chuanHoa(hs.get(MTS.substring(0,3))) + " " + chuanHoa(diemTong()) + " " + trangThai;
    }

}
