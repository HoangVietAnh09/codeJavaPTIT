package codePTIT.ThucHanh;

public class Doi {
    public static int cnt = 1;
    private String ID, ten;

    public Doi(String ten){
        this.ID = "Team" + String.format("%02d", cnt++);
        this.ten = ten;
    }
    public String getID(){
        return ID;
    }

    public String getTen() {
        return ten;
    }
}
