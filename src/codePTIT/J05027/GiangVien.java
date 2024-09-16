package codePTIT.J05027;

class GiangVien {
    public static int cnt = 1;
    private String MGV, hoTen, boMon;

    public GiangVien(String hoTen, String boMon) {
        this.MGV = "GV" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
    public String getHoTen() {
        return hoTen;
    }

    public String format(String boMon){
        String res = "";
        String[] words = boMon.split("\\s+");
        for(int i = 0; i < words.length; i++){
            res += words[i].substring(0, 1).toUpperCase();
        }
        return res;
    }

    public String toString(){
        return MGV + " " + hoTen + " " + format(boMon);
    }
}
