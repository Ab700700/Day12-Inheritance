public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public String toString(){
        String s = "";
        if(!filled) s="not";
        return "A shape with color of "+color+" and "+s+" filled";
    }


}
