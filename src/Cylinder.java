import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    @Override
    public void calculateArea()
    {
        System.out.println("Enter radius and height to find area of cylinder: ");
        Scanner sc= new Scanner(System.in);
        double R=sc.nextDouble();
        Scanner sc1= new Scanner(System.in);
        double H=sc1.nextDouble();
        double area = (2* Math.PI * R * H) + (2* Math.PI * Math.pow(R,2));
        System.out.println("Area of cylinder ="+ area);
    }

    @Override
    public void calculateVolume()
    {
        System.out.println("Enter radius and height to find volume of cylinder: ");
        Scanner sc= new Scanner(System.in);
        double R=sc.nextDouble(); 
        Scanner sc1= new Scanner(System.in);
        double H=sc1.nextDouble();
        double volume =  (Math.PI * Math.pow(R,2) * H);
        System.out.println("Area of cylinder ="+ volume);
    }
}
