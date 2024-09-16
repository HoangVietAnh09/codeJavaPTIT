package codePTIT.J07071;

class DoiTuong {
    private String ho, ten, dem;

    public DoiTuong(String ho, String ten, String dem) {
        this.ho = ho;
        this.ten = ten;
        this.dem = dem;
    }

    public String getHo() {
        return ho;
    }


    public String getDem() {
        return dem;
    }

    public String toString(){
        return ho + " " + dem + " " + ten;
    }

}
