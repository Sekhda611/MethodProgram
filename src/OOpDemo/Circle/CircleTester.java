package OOpDemo.Circle;

public class CircleTester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // based on first constructor
         double radius = circle1.getRadius();
        System.out.println("Radius " + radius);
        double areaCircle1 = circle1.computeArea();
        double perimeterCircle1 = circle1.computePerimeter();
        System.out.println("Area of circle is; " + areaCircle1);
        System.out.println("perimeter is: " + perimeterCircle1);

        System.out.printf("After formatting : area is %.2f\n", areaCircle1 );
        System.out.printf(" area is : %.2f\n", perimeterCircle1);

        Circle circle2 = new Circle(5.6);
        double areaCircle2 = circle2.computeArea();
        double perimeterCircle2 = circle2.computePerimeter();

        System.out.println("Area of Circle2: " + areaCircle2);
        System.out.println("Perimeter of Circle2: " + perimeterCircle2);

        System.out.printf("After formatiing: Area is  %.2f\n",  areaCircle2);
        System.out.printf("After formatiing : Area is %.2f\n",perimeterCircle2);
    }
}
