package codePTIT.J07010;

import java.text.SimpleDateFormat;
import java.util.Date;

class SinhVien {
    public static int cnt = 1;
    public String MSV, hoTen, lop, ngaySinh;
    public double gpa;
    SinhVien(){
        MSV = hoTen = lop = ngaySinh = "";
        gpa = 0.0;
    }
    SinhVien(String hoTen, String lop, String ngaySinh, double gpa){
        this.MSV = "B20DCCN" + String.format("%03d", cnt++);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public String formatNgaySinh(){
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse(ngaySinh);
            return dateFormat.format(date);
        }catch (Exception e){
            System.out.println(e);
        }
        return "";
    }
    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + formatNgaySinh() + " " + String.format("%.2f", gpa);
    }

}