package codePTIT.J07059;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

class CaThi implements Comparable<CaThi>{
    public static int cnt = 1;
    private String ma, ngayThi, caThi;
    private String phong;

    public CaThi(String ngayThi, String caThi, String phong) throws ParseException {
        this.ma = String.format("C%03d", cnt++);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayThi = sdf.format(sdf.parse(ngayThi));
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        this.caThi = sdf2.format(sdf2.parse(caThi));
        this.phong = phong;
    }


    @Override
    public int compareTo(CaThi o) {
        if(this.ngayThi.equals(o.ngayThi)){
            if(this.caThi.equals(o.caThi)){
                return this.ma.compareTo(o.ma);
            }
            return this.caThi.compareTo(o.caThi);
        }
        return this.ngayThi.compareTo(o.ngayThi);
    }

    public String toString(){
        return ma + " " + ngayThi + " " + caThi + " " + phong;
    }
}
