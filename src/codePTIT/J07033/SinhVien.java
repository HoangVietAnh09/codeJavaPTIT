package codePTIT.J07033;

class SinhVien implements Comparable<SinhVien>{
    private String MSV, hoTen, lop, email;
    public SinhVien(){
        MSV = hoTen = lop = email = "";
    }
    public SinhVien(String MSV, String hoTen, String lop, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    public String formatHoTen(String s){
        String[] res = s.trim().split("\\s+");
        for(int i = 0; i < res.length; i++){
            res[i] = res[i].substring(0,1).toUpperCase() + res[i].substring(1).toLowerCase();
        }
        return String.join(" ", res);
    }

    public String toString(){
        return MSV + " " + formatHoTen(hoTen) + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return MSV.compareTo(o.MSV);
    }
}
