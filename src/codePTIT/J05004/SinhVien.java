package codePTIT.J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class SinhVien {
    public static int cnt = 1;
    private String MSV, hoTen, lop, ngaySinh;
    private double diem;

    public SinhVien(String hoTen, String lop, String ngaySinh, double diem) throws ParseException {
        this.MSV = "B20DCCN" + String.format("%03d", cnt++);
        this.hoTen = hoTen;
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = sdf.format(sdf.parse(ngaySinh));
        this.diem = diem;
    }

    public String formatHoTen(String hoTen){
        String[] words = hoTen.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public String toString(){
        return MSV + " "  + formatHoTen(hoTen) + " " + lop + " " + ngaySinh + " " + String.format("%.2f", diem);
    }

}
