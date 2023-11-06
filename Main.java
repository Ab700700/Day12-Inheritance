
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Balck",true,10);
        System.out.println("------Circle-------");
        System.out.println("Radius: "+c1.getRadius());
        System.out.println("Area: "+c1.getArea());
        System.out.println(c1.toString());
        System.out.println("-------------");
        Rectangle r1 = new Rectangle("White",true,3,4);
        System.out.println("------Rectangle-------");
        System.out.println("Width: "+r1.getWidth());
        System.out.println("Length: "+r1.getLength());
        System.out.println("Area: "+ r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println("------before set-------");
        System.out.println("Width: "+r1.getWidth());
        System.out.println("Length: "+r1.getLength());
        System.out.println("------after set-------");
        r1.setLength(5);
        r1.setWidth(5);
        System.out.println("Width: "+r1.getWidth());
        System.out.println("Length: "+r1.getLength());
        System.out.println("-------------");
        Square s1 =new Square("Green",true,4,4);
        System.out.println("------Square-------");
        System.out.println("Side: "+s1.getSide());
        System.out.println("Area: "+s1.getArea());
        System.out.println("Perimeter: "+s1.getPerimeter());
        System.out.println(s1.toString());
        System.out.println("------before set-------");
        System.out.println("Side: "+s1.getSide());
        System.out.println("------after set-------");
        s1.setSide(2);
        System.out.println("Side: "+s1.getSide());
        System.out.println("-------------");




    }
}