package codePTIT.J07071;

class DoiTuong implements Comparable<DoiTuong> {
    private String hoTen, ho, dem, ten, vietTat;

    public DoiTuong(String hoTen) {
        this.hoTen = hoTen;
        this.dem = "";
        this.vietTat = "";
        String[] token = hoTen.split("\\s+");
        this.ho = token[0];
        this.ten = token[token.length-1];
        for(int i=1;i<token.length-1;i++){
            this.dem += token[i].substring(0,1);
        }
        for(int i = 0; i < token.length;i++){
            this.vietTat += token[i].substring(0,1);
        }
    }

    public String getHo() {
        return ho;
    }

    public String getDem() {
        return dem;
    }

    public String getVietTat(){ return vietTat;}

    public String toString() {
        return hoTen;
    }

    @Override
    public int compareTo(DoiTuong o) {
        if(ten.compareTo(o.ten)==0){
            return ho.compareTo(o.ho);
        }
        return ten.compareTo(o.ten);
    }
}
