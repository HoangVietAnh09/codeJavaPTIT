package codePTIT.ThucHanh;

import java.util.ArrayList;

public class Truong {
    private String sf, ten;
    private Doi doi;


    public Truong(String sf, String ten){
        this.sf = sf;
        this.ten = ten;
    }

    public String getSf() {
        return sf;
    }
    public String getTen(){
        return this.ten;
    }

//    public void setList(ArrayList<Doi> list){
//        this.list = list;
//    }
    public void setDoi(Doi doi){
        this.doi = doi;
    }

    public String toString(){
        return doi.getID() + " " + doi.getTen() + " " + ten;
    }

}
