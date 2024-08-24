package codePTIT.J07054;

class SinhVien implements Comparable<SinhVien>{
    public static int cnt=1;
    private String MSV, hoten;
    private double diem1, diem2, diem3, diemTrungBinh;
    private int rank;

    public SinhVien(String hoten, double diem1, double diem2, double diem3) {
        this.MSV = "SV" + String.format("%02d", cnt++);
        this.hoten = hoten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTrungBinh = (diem1*3 + diem2*3 + diem3*2)/8;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRank() {
        return rank;
    }
    public double getDiemTrungBinh(){
        return diemTrungBinh;
    }
    public String formatHoTen(String s){
        String[] words = s.trim().split("\\s+");
        for(int i=0; i<words.length; i++){
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(diemTrungBinh == o.diemTrungBinh){
            return MSV.compareTo(o.MSV);
        }
        return diemTrungBinh < o.diemTrungBinh ? 1 : -1;
    }

    @Override
    public String toString() {
        return MSV + " " + formatHoTen(hoten) + " " + String.format("%.2f", diemTrungBinh) + " " + rank;
    }
}
