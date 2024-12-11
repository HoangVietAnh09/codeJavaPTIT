package codePTIT.J07072;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J07072 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DANHSACH.in"));
        ArrayList<DoiTuong> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String hoTen = sc.nextLine();
            list.add(new DoiTuong(hoTen));
        }
        Collections.sort(list);
        for (DoiTuong doiTuong : list) {
            System.out.println(doiTuong);
        }

    }
}
