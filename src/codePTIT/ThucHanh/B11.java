package codePTIT.ThucHanh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\INSTITUTION.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Truong> list = new ArrayList<>();
        while (t-- > 0) {
            String sf = sc.next();
            String ten = sc.nextLine();
            list.add(new Truong(sf, ten));
        }

        sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\REGISTER.in"));
        t = sc.nextInt();
        while(t-- > 0) {
            sc.nextLine();
            String sf = sc.next();
            int soLuong = sc.nextInt();
            for(int i = 0; i < soLuong; i++){
                String ten = sc.nextLine();
                for(int j = 0; j < list.size(); j++){
                    Doi doi = new Doi(ten);
                    if(list.get(j).getSf().equals(sf)){
                        list.get(i).setDoi(doi);
                    }
                }
            }

        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }



    }
}
