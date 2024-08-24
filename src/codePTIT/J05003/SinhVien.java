package codePTIT.J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SinhVien{
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


    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f",diem);
    }

}
