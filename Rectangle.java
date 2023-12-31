public class Rectangle extends Shape{

    private double width=1.0;
    private double length=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    public String toString(){
        return " A rectangle with width= "+width+" and length= "+length+", which is a subclass of "+super.toString();
    }
}
