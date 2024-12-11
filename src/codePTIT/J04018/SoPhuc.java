package codePTIT.J04018;

public class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public SoPhuc cong(SoPhuc a){
        SoPhuc x = new SoPhuc(0, 0);
        x.thuc = a.thuc + thuc;
        x.ao = a.ao + ao;
        return x;
    }

    public SoPhuc nhan(SoPhuc a){
        SoPhuc x = new SoPhuc(0, 0);
        x.thuc = a.thuc * thuc + -ao*a.ao;
        x.ao = a.ao*thuc + a.thuc*ao;
        return x;
    }

    public int getAo(){
        return ao;
    }

    public void setAo(int ao){
        this.ao = ao;
    }

    public String toString(){
        if(ao < 0){
            ao *= -1;
            return thuc + " - " + ao + "i";
        }
        return thuc + " + " + ao + "i";
    }
}
