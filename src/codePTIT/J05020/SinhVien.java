package codePTIT.J05020;

class SinhVien implements Comparable<SinhVien>{
    private String MSV, hoTen, lop, email;

    public SinhVien(String MSV, String hoTen, String lop, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }



    public String toString(){
        return MSV + " " + hoTen + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(lop.equals(o.lop)){
            return MSV.compareTo(o.MSV);
        }
        return lop.compareTo(o.lop);
    }
}
