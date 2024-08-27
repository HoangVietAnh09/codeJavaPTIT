package codePTIT.J05026;

class GiangVien {
    public static int cnt = 1;
    private String MGV, hoTen, khoa;

    public GiangVien(String hoTen, String khoa) {
        this.MGV = "GV" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.khoa = khoa;
    }

    public String getKhoa(){
        String[] words = khoa.split("\\s+");
        String res = "";
        for(int i = 0; i < words.length; i++){
            res += words[i].substring(0,1).toUpperCase();
        }
        return res;
    }

    public String toString(){
        return MGV + " " + hoTen + " " + getKhoa();
    }
}
