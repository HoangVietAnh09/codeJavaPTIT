package codePTIT.J07072;

class DoiTuong implements Comparable<DoiTuong>{
    private String hoTen, ho, dem, ten;


    public DoiTuong(String hoTen){
        this.hoTen = hoTen;
        String[] words = hoTen.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        this.dem = "";
        this.hoTen = String.join(" ", words);
        this.ho = words[0];
        this.ten = words[words.length-1];
        for(int i = 1; i < words.length-1; i++){
            this.dem += words[i];
        }
    }
    public String toString(){
        return hoTen;
    }
    @Override
    public int compareTo(DoiTuong o) {
        if(ten.compareTo(o.ten)==0){
            if(ho.compareTo(o.ho)==0){
                return dem.compareTo(o.dem);
            }
            return ho.compareTo(o.ho);
        }
        return ten.compareTo(o.ten);
    }
}
