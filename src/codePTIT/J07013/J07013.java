package codePTIT.J07013;
// Doi package thanh danhsachsinhvien1

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07013 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> list = (ArrayList<SinhVien>) ois.readObject();
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
