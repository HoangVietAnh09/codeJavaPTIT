package codePTIT.J05054;

import codePTIT.ThucHanh3.B4.SinhVien;

import java.util.*;



public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list = new ArrayList<>();
        ArrayList<HocSinh> clone = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            double diemTrungBinh = Double.parseDouble(sc.nextLine());
            list.add(new HocSinh(hoTen, diemTrungBinh));
            clone = (ArrayList<HocSinh>) list.clone();
        }
        Collections.sort(list);
        for(HocSinh hs : clone){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getDiemTrungBinh() == hs.getDiemTrungBinh()){
                    hs.setThuTu(i+1);
                    break;
                }
            }
            System.out.println(hs);
        }
    }
}
