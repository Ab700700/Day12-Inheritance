public class Square extends Rectangle {
    public Square() {
    }
    public Square(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, width);
    }

    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double width){
        super.setWidth(width);
        super.setLength(width);
    }

    public String toString(){
        return " A square with side= "+super.getWidth()+", which is a subclass of "+super.toString();
    }

}
