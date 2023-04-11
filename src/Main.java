public class Main {
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        circle.showShape(" Circle");
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.showShape(" Rectangle");
        rectangle.calculateArea();

        Sphere sphere = new Sphere();
        sphere.showShape(" Sphere");
        sphere.calculateArea();
        sphere.calculateVolume();

        Cylinder cylinder = new Cylinder();
        cylinder.showShape(" Cylinder");
        cylinder.calculateArea();
        cylinder.calculateVolume();
    }


}