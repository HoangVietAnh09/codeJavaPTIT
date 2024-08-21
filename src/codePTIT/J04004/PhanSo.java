package codePTIT.J04004;

class PhanSo {
    private long tu, mau;

    public PhanSo() {
        tu = mau = 1;
    }

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

    public long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }


    public String toString() {
        long tmp = gcd(this.tu, this.mau);
        return tu/tmp + "/" + mau/tmp;
    }
}
