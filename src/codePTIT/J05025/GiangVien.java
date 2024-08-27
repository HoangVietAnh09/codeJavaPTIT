package codePTIT.J05025;

class GiangVien implements Comparable<GiangVien> {
    public static int cnt = 1;
    private String MGV, hoTen, khoa, ten;


    public GiangVien(String hoTen, String khoa) {
        this.MGV = "GV" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.khoa = khoa;
    }

    public String formatKhoa(){
        String[] words = khoa.split(" ");
        String tmp = "";
        for (int i = 0; i < words.length; i++) {
            tmp += words[i].substring(0,1).toUpperCase();
        }
        return tmp;
    }
    public String getTen(){
        String res;
        String[] tmp = hoTen.split("\\s+");
        res = tmp[tmp.length-1];
        return res;
    }

    public String toString(){
        return MGV + " " + hoTen + " " + formatKhoa();
    }

    @Override
    public int compareTo(GiangVien o) {
        return getTen().compareTo(o.getTen());
    }
}
