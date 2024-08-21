package codePTIT.J04002;

class Rectange{
    private double width,height;
    private String color;
    public Rectange(){
        width = height = 0;
        color = "red";
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public void setColor(String color){
        this.color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double findrea(){
        return width*height;
    }
    public double findPerimeter(){
        return 2*width+2*height;
    }
    @Override
    public String toString(){
        return String.format("%d %d %s", (int)findPerimeter(), (int)findrea(), getColor());
    }


}