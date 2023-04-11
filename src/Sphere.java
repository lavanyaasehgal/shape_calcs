import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    @Override
    public void calculateArea()
    {
        System.out.println("Enter radius to find area of sphere: ");
        Scanner sc= new Scanner(System.in);
        double R=sc.nextDouble();
        double area = 4*Math.PI*Math.pow(R,2);
        System.out.println("Area of sphere ="+ area);
    }

    @Override
    public void calculateVolume()
    {
        System.out.println("Enter radius to find area of sphere: ");
        Scanner sc= new Scanner(System.in);
        double R=sc.nextDouble();
        double volume = (4/3)*Math.PI*Math.pow(R,3);
        System.out.println("Volume of sphere ="+ volume);
    }
}

