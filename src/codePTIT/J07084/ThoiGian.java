package codePTIT.J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class ThoiGian implements Comparable<ThoiGian> {
    private String hoTen, batDau, ketThuc;
    private long tong;

    public ThoiGian(String hoTen, String batDau, String ketThuc) throws ParseException {
        this.hoTen = hoTen;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.tong = (sdf.parse(ketThuc).getTime() - sdf.parse(batDau).getTime())/60000;
    }

    public String toString(){
        return hoTen + " " + tong;

    }


    @Override
    public int compareTo(ThoiGian o) {
        if(Long.compare(tong, o.tong) == 0){
            return hoTen.compareTo(o.hoTen);
        }
        return -Long.compare(tong, o.tong);
    }
}
