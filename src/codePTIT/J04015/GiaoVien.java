package codePTIT.J04015;

class GiaoVien {
    private String id, hoTen;
    private int luong;
    GiaoVien(){
        id = hoTen = "";
        luong = 0;
    }
    GiaoVien(String id, String hoTen, int luong) {
        this.id = id;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public int phuCap(String s){
        s = s.substring(0,2);
        if(s.equals("HT")) return 2000000;
        if(s.equals("HP")) return 900000;
        return 500000;
    }
    public int bac(String s){
        String tmp = s.substring(s.length()-2,s.length());
        int bac = 0;
        for (int i = 0; i < tmp.length(); i++) {
            int r = tmp.charAt(i) - '0';
            bac = bac*10 + r;
        }
        return bac;
    }

    public String toString(){
        return id + " " + hoTen + " " + bac(id) + " " + phuCap(id) + " " + (luong*bac(id)+phuCap(id));
    }

}
