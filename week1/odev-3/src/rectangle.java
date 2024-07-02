public class rectangle {
    private double height;
    private double width;

    public rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double area(){
        return height*width;
    }

    public double perimeter(){
        return 2*(height+width);
    }
}
