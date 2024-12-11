package codePTIT.ThucHanh;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class B7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<MonHoc>();
        Set<String> setMMH = new HashSet<>();
        while(sc.hasNext()){
            String MMH = sc.nextLine();
            String ten = sc.nextLine();
            String hinhThuc = sc.nextLine();
            MonHoc monHoc = new MonHoc(MMH, ten, hinhThuc);
            if(!setMMH.contains(monHoc.getMMH())){
                setMMH.add(monHoc.getMMH());
                list.add(monHoc);
            }
        }
        Collections.sort(list);
        for(MonHoc monHoc : list){
            System.out.println(monHoc);
        }
    }
}
