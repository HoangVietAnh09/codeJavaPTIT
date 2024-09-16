package codePTIT.J05048;

class DonHang {
    private String MDH;
    private long soLuongXuat, soLuongNhap, donGia, tien, thue;

    public DonHang(String MDH, long soLuongNhap) {
        this.MDH = MDH;
        this.soLuongNhap = soLuongNhap;
        if(this.MDH.substring(0,1).equals("A")){
            this.soLuongXuat = Math.round(this.soLuongNhap * 0.6);
        }else{
            this.soLuongXuat = Math.round(this.soLuongNhap * 0.7);
        }
        if(this.MDH.substring(this.MDH.length()-1).equals("Y")){
            this.donGia = 110000;
        }else{
            this.donGia = 135000;
        }

        this.tien = this.soLuongXuat * this.donGia;

        if(this.MDH.substring(0,1).equals("A")){
            if(this.MDH.substring(this.MDH.length()-1).equals("Y")){
                this.thue = Math.round(this.tien * 0.08);
            }else{
                this.thue = Math.round(this.tien * 0.11);
            }
        }else{
            if(this.MDH.substring(this.MDH.length()-1).equals("Y")){
                this.thue = Math.round(this.tien * 0.17);
            }else{
                this.thue = Math.round(this.tien * 0.22);
            }
        }
    }

    public String toString(){
        return MDH + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }


}
