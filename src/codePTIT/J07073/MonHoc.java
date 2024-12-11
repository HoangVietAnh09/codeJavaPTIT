package codePTIT.J07073;

class MonHoc implements Comparable<MonHoc>{
    private String MMH, ten, hinhThucLyThuyet, hinhThucThucHanh;
    private int soTin;

    public MonHoc(String MMH, String ten, String hinhThucLyThuyet, String hinhThucThucHanh, int soTin) {
        this.MMH = MMH;
        this.ten = ten;
        this.hinhThucLyThuyet = hinhThucLyThuyet;
        this.hinhThucThucHanh = hinhThucThucHanh;
        this.soTin = soTin;
    }

    public String getHinhThucThucHanh(){
        return hinhThucThucHanh;
    }

    public String toString(){
        return MMH + " " + ten + " " + soTin + " " + hinhThucLyThuyet + " " + hinhThucThucHanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return MMH.compareTo(o.MMH);
    }
}
