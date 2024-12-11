package codePTIT.ThucHanh3.B4;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\BAITAP.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String deTai = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, deTai));
        }
        Scanner sc1 = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\BAOCAO.in"));
        while(sc1.hasNextLine()){
            String MSV = sc1.nextLine();
            String thoiGian = sc1.nextLine();
            BaoCao baoCao = new BaoCao(MSV, thoiGian);
            for(SinhVien sv : list){
                if(sv.getMSV().equals(MSV)){
                    sv.setBaoCao(baoCao);
                }
            }
        }
        int sang = 0;
        int chieu = 0;
        for(SinhVien sv : list){
            if(Integer.parseInt(sv.getBaoCao().getThoiGan().substring(0,2)) < 12){
                sang++;
            }else{
                chieu++;
            }
        }

        System.out.printf("DANH SACH SINH VIEN BAO CAO CA SANG: %d\n", sang);
        for(SinhVien sv : list){
            if (Integer.parseInt(sv.getBaoCao().getThoiGan().substring(0,2)) < 12){
                System.out.println(sv);
            }
        }
        System.out.println();
        System.out.printf("DANH SACH SINH VIEN BAO CAO CA CHIEU: %d\n", chieu);
        for(SinhVien sv : list){
            if (Integer.parseInt(sv.getBaoCao().getThoiGan().substring(0,2)) >= 12){
                String tmp = sv.getBaoCao().getThoiGan().substring(0,2);
                int d = Integer.parseInt(tmp) - 12;
                String de = String.format("%02d", d);
                sv.getBaoCao().setThoiGan(sv.getBaoCao().getThoiGan().replace(sv.getBaoCao().getThoiGan().substring(0,2),de));
                System.out.println(sv);
            }
        }


    }
}
