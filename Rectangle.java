public class Rectangle extends Shape{

    private double width;
    private double height;

    //Konstruktør

    public Rectangle() {

        this(2.0, 3.0);
    }

    public Rectangle(double width, double height) {
        super();

        this.setWidth(width);
        this.setHeight(height);
    }

    //Getter-metode
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    //Setter-metode
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //Metode

    //Areal
    public double getArea() {

        return width*height;
    }
    //Omkrets
    public double getPerimeter() {

        return (width*2)*(height*2);
    }
   @Override
    public String toString() {
        return
                "Rectangle: Color: " + this.getColor() +
                        " Filled: " + this.isFilled() +
                        "  Width: " + this.getWidth() + " Height: " +
                        this.getHeight() + " Area: " + this.getArea() +
                        " Perimeter: " + this.getPerimeter() + " Id: " +
                        this.getId();
    }

}
