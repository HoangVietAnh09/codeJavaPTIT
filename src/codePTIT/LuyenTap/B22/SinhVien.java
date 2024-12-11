package codePTIT.LuyenTap.B22;

public class SinhVien implements Comparable<SinhVien>{
    private String hoTen;
    private int correct, submit;

    public SinhVien(String hoTen, int correct, int submit) {
        this.hoTen = hoTen;
        this.correct = correct;
        this.submit = submit;
    }

    public String toString(){
        return hoTen + " " + correct + " " + submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(correct == o.correct){
            if(submit == o.submit){
                return hoTen.compareTo(o.hoTen);
            }
            return Integer.compare(submit, o.submit);
        }
        return -Integer.compare(this.correct, o.correct);
    }
}
