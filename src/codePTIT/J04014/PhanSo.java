package codePTIT.J04014;


class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau(){
        return mau;
    }

    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public PhanSo rutGon(PhanSo p) {
        long tmp = gcd(p.tu, p.mau);
        PhanSo q = new PhanSo(p.tu/tmp, p.mau/tmp);
        return q;

    }
    public String toString() {
        return tu + "/" + mau;
    }
}
