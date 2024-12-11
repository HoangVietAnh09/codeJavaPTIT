package codePTIT.J05075;

public class DiemDanh {
    private String MSV, diemDanh, trangThai;
    private int diem;

    public DiemDanh(String MSV, String diemDanh) {
        this.MSV = MSV;
        this.diemDanh = diemDanh;
        this.diem = 10;
        for(int i = 0; i<diemDanh.length(); i++){
            if(this.diemDanh.charAt(i) == 'v'){
                this.diem -= 2;
            }else if(this.diemDanh.charAt(i) == 'm'){
                this.diem -= 1;
            }
        }
        this.diem = Math.max(0, this.diem);
    }
    public int getDiem(){
        return this.diem;
    }

}