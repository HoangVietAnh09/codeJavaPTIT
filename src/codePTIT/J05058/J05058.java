package codePTIT.J05058;


import java.text.DecimalFormat;
import java.util.*;



public class J05058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while (t-- > 0) {
            String MTS = sc.nextLine();
            String hoTen = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(MTS,hoTen,toan,ly,hoa));
        }
        Collections.sort(list);

        for(ThiSinh thiSinh : list){
            System.out.println(thiSinh);
        }
    }
}
