import java.util.Scanner;

public class Circle extends Shape
{
    @Override
    public void calculateArea() {
        System.out.println("Enter radius of circle to find area: ");
        Scanner sc= new Scanner(System.in);
        double R=sc.nextDouble();
        double area = Math.PI * Math.pow(R,2);
        System.out.println("Area of circle ="+ area);
    }
}
