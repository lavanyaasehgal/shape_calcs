import java.util.Scanner;
public class Rectangle extends Shape
{
    public void calculateArea()
    {
        System.out.println("Enter length and breadth of rect to find area: ");
        Scanner sc= new Scanner(System.in);
        double L=sc.nextDouble();
        Scanner sc1= new Scanner(System.in);
        double B=sc1.nextDouble();
        double area = L * B;
        System.out.println("Area of rectangle ="+ area);
    }
}
