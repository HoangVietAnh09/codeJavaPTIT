package codePTIT.J07056;

import java.util.HashMap;

class KhachHang implements Comparable<KhachHang>{
    public static int cnt = 1;
    private String MKH, hoTen, loai, info;
    private int chiSoDau, chiSoCuoi, soDien, tienTrongDinhMuc, tienVuotDinhMuc, VAT, tongTien;
    public HashMap<String, Integer> hs = new HashMap<>();
    public KhachHang(String hoTen, String info) {
        this.MKH = "KH" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.info = info;
        String[] words = this.info.split("\\s+");
        this.loai = words[0];
        this.chiSoDau = Integer.parseInt(words[1]);
        this.chiSoCuoi = Integer.parseInt(words[2]);
        this.soDien = this.chiSoCuoi - this.chiSoDau;
        hs.put("A", 100);
        hs.put("B", 500);
        hs.put("C", 200);
        if(this.soDien < hs.get(this.loai)){
            this.tienTrongDinhMuc = this.soDien * 450;
        }else{
            this.tienTrongDinhMuc = hs.get(this.loai) * 450;
        }
        if(this.soDien > hs.get(this.loai)){
            this.tienVuotDinhMuc = (this.soDien - hs.get(this.loai)) * 1000;
        }else{
            this.tienVuotDinhMuc = 0;
        }
        this.VAT = (int)(this.tienVuotDinhMuc*0.05);
        this.tongTien = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.VAT;

    }
    public String formatHoten(String s) {
        String[] words = s.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }
    public String toString(){
        return MKH + " " + formatHoten(hoTen) + " " + tienTrongDinhMuc + " " + tienVuotDinhMuc + " " + VAT + " " + tongTien;
    }

    @Override
    public int compareTo(KhachHang o) {
        return tongTien < o.tongTien ? 1 : -1;
    }
}
