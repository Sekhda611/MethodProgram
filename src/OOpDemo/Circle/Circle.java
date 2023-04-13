package OOpDemo.Circle;

/** Class naem Circle;
 * Descripption this program is to generate a circle type template program
 */
public class Circle {
    //field
    private double radius;
    //Constructor no arg consturctor
    public Circle(){
        radius = 10.0;  //Equivalent to this(10.0)
       //this(15.0);
    }
    // constructor with parameteres
    public Circle(double radius){
        this.radius  = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double computeArea(){
        double area = Math.PI * radius *radius;
        return area;
    }
    public double computePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    //setters
    public void setRadius(double radius){
        this.radius = radius;
    }
    //override
    public String toString(){
        return "Radius" + this.radius;
    }
}
