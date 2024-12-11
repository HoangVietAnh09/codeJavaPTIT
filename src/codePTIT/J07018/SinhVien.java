package codePTIT.J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    public static int cnt = 1;
    private String MSV, hoTen, ngaySinh, lop;
    private double gpa;

    public SinhVien(String hoTen, String ngaySinh, String lop, double gpa) throws ParseException {
        this.MSV = "B20DCCN" + String.format("%03d", cnt++);
        String[] words = hoTen.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
        }
        this.hoTen = res.trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = sdf.format(sdf.parse(ngaySinh));
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
