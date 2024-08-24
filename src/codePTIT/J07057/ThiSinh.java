package codePTIT.J07057;

class ThiSinh implements Comparable<ThiSinh>{
    public static int cnt = 1;
    private double target = 20.5;
    private String MTS, hoTen, danToc;
    private double diemThi, uuTien;
    private int khuVuc;

    public ThiSinh(String hoTen, String danToc, double diemThi, int khuVuc){
        this.MTS = "TS" + String.format("%02d", cnt++);
        this.hoTen = hoTen;
        this.danToc = danToc;
        this.diemThi = diemThi;
        this.khuVuc = khuVuc;
        if(this.khuVuc == 1){
            this.uuTien = 1.5;
        }else if(this.khuVuc == 2){
            this.uuTien = 1;
        }else if(this.khuVuc == 3){
            this.uuTien = 0;
        }
        if(this.danToc.compareTo("Kinh") == 0) this.uuTien += 0;
        else this.uuTien += 1.5;
    }

    public String formatHoTen(String hoTen){
        String[] words = hoTen.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public double diemTong(){
        return this.diemThi + this.uuTien;
    }

    public String trangThai(){
        return this.diemTong() >= target ? "Do" : "Truot";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(diemTong() == o.diemTong()){
            return MTS.compareTo(o.MTS);
        }
        return diemTong() < o.diemTong() ? 1 : -1;
    }

    public String toString(){
        return MTS + " " + formatHoTen(hoTen) + " " + String.format("%.1f", this.diemTong()) + " " + trangThai();
    }


}
