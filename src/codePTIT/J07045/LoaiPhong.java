package codePTIT.J07045;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String line;
    private String name;

    public LoaiPhong(String line) {
        this.line = line;
        this.name = line.split(" ")[1];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }

    public String toString(){
        return line;
    }
}
