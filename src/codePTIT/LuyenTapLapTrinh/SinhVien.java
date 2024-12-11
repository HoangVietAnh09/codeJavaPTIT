package codePTIT.LuyenTapLapTrinh;

public class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private int ac, submit;

    public SinhVien(String hoTen, int ac, int submit) {
        this.hoTen = hoTen;
        this.ac = ac;
        this.submit = submit;
    }


    @Override
    public int compareTo(SinhVien o) {
        if(this.ac == o.ac){
            if(this.submit == o.submit){
                return this.hoTen.compareTo(o.hoTen);
            }
            return Integer.compare(this.submit, o.submit);
        }
        return -Integer.compare(this.ac, o.ac);
    }

    public String toString(){
        return hoTen + " " + ac + " " + submit;
    }
}
