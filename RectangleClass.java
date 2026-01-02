class Rectangle{
    public double l;
    public double b;
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
}
public class RectangleClass{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.l=40;
        r.b=20.5;
        System.out.println("Area of Rectangle: " + r.area()+"cm");
        System.out.print("Perimeter of Rectangle: " + r.perimeter()+"cm");
    }
}