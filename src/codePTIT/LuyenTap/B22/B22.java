package codePTIT.LuyenTap.B22;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B22 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            String s = sc.nextLine();
            int correct = Integer.parseInt(sc.next());
            int submit = Integer.parseInt(sc.next());
            list.add(new SinhVien(s, correct, submit));
        }
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
