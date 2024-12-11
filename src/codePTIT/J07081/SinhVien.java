package codePTIT.J07081;

class SinhVien implements Comparable<SinhVien>{
    private String MSV, hoTen, sdt, email, ho, dem, ten;

    public SinhVien(String MSV, String hoTen, String sdt, String email) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
        this.dem = "";
        String[] words = hoTen.trim().split("\\s+");
        this.ho = words[0];
        this.ten = words[words.length - 1];
        for(int i = 1; i < words.length - 1; i++){
            this.dem += words[i] + " ";
        }
    }


    public String toString(){
        return dem;
    }
    @Override
    public int compareTo(SinhVien o) {
        if(ten.compareTo(o.ten)==0){
            if(ho.compareTo(o.ho)==0){
                if(dem.compareTo(o.dem)==0){
                    return MSV.compareTo(o.MSV);
                }
                return dem.compareTo(o.dem);
            }
            return ho.compareTo(o.ho);
        }
        return ten.compareTo(o.ten);
    }
}
