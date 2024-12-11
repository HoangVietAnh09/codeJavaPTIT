package codePTIT.J05055;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05055 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> list = new ArrayList<>();
        ArrayList<VanDongVien> clone = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String xuatPhat = sc.nextLine();
            String denDich = sc.nextLine();
            list.add(new VanDongVien(hoTen, ngaySinh, xuatPhat, denDich));
            clone = (ArrayList) list.clone();
        }
        Collections.sort(list);
        for(VanDongVien vdv : clone){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getThanhTichThuc() == vdv.getThanhTichThuc()){
                    vdv.setRank(i+1);
                    break;
                }
            }
        }
        for(VanDongVien vdv : clone){
            System.out.println(vdv);
        }
//        String[] words = "12/12/1990".split("\\/");
//        System.out.println(2021 - Integer.parseInt(words[2]));
    }
}
