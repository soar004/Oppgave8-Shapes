public class Circle extends Shape
{
    //# Felter
    private double radius;
    private int id;

    //# Konstruktører
    public Circle() {
        this(1.0);


    }

    public Circle(double radius) {
        super();

        this.setRadius(radius);
    }

    public Circle(String color, boolean filled, double radius, int id) {
        super(color, filled, id);

        this.setRadius(radius);
    }

    //# Getter-metoder
    public double getRadius() {
        return this.radius;
    }

    //# Setter-metoder
    private void setRadius(double value) {
        this.radius = value;
    }

    //# Metoder
    // Regn ut areal
    public double getArea() {

        double pi = Math.PI;
        double area = pi*Math.pow(radius,2);
        return Math.round(area);
    }

    // Regn ut omkrets
    public double getPerimeter() {
       double diameter = (radius * 2) * Math.PI;
        return Math.round(diameter);
    }
    @Override
    public String toString() {
        return
                "Circle: Color: " + this.getColor() +
                        " Filled: " + this.isFilled() +
                        " Radius: " + this.getRadius() + " Area: " + this.getArea() +
                        " Perimeter: " + this.getPerimeter() + " Id: " +
                        this.getId();
    }

}