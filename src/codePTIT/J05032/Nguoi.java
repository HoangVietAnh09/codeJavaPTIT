package codePTIT.J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Nguoi implements Comparable<Nguoi>{
    private String hoTen, ngaySinh;

    public Nguoi(String hoTen, String ngaySinh) throws ParseException {
        this.hoTen = hoTen;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = sdf.format(sdf.parse(ngaySinh));
    }

    public String toString() {
        return hoTen;
    }

    @Override
    public int compareTo(Nguoi o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(ngaySinh).compareTo(sdf.parse(o.ngaySinh));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
