import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
 Circle a1 = new Circle();
 Scanner ad = new Scanner(System.in);
 double af = ad.nextDouble();
 a1.setRadius(af);
        System.out.println(a1.getRadius());
        a1.setCircle(af);
        System.out.println("Circle is: " + a1.getCircle());

    }
}
class Circle{
    private double radius;
    private double circle;
    public void setRadius(double n){
radius= n;
    }
    public double getRadius(){
        return radius;
    }
    public void setCircle(double m){
        circle = m;
    }
    public double getCircle(){
        circle = radius * radius * 3.14;
        return circle;
    }
        }
