public class Circle extends Shape
{
    //# Felter
    private double radius;

    //# Konstruktører
    public Circle() {
        this(1.0);


    }

    public Circle(double radius) {
        super();

        this.setRadius(radius);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);

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
        return pi*Math.pow(radius,2);
    }

    // Regn ut omkrets
    public double getPerimeter() {
       double diameter = (radius * 2) * Math.PI;
        return Math.round(diameter);
    }
    @Override
    public String toString() {
        return
                "Circle[ color = " + this.getColor() +
                        " filled = " + this.isFilled()+ " radius = " + this.getRadius() + " perimeter = " + this.getPerimeter() + " id = " + this.getId();
    }

}