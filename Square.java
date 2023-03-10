public class Square extends Rectangle
{
    //# Felter
    private double width;
    private double height;
    
    //# Konstruktører
    public Square() {
        this(0.0,0.0);
    }
    
    public Square(double width, double height) {
        super();
        
        this.setWidth(width);
        this.setHeight(height);
    }

    public Square(String color, boolean filled, double width, double height, int id) {
        super(color, filled, width, height, id);




    }


    //# Getter-metoder
    public double getWidth() {

        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    //# Setter-metoder
    public void setHeight(double value) {
        this.height = value;
    }

    public void setWidth(double value) {
        this.width = value;
    }
    
    //# Metoder
    // Areal
    public double getArea() {

        return width*height;
    }
    // Omkrets
    public double getPerimeter() {

        return (width*2)*(height*2);
    }

    @Override
    public String toString() {
            return
                    "Square: Color: " + this.getColor() +
                            " Filled: " + this.isFilled() +
                            "  Width: " + this.getWidth() + " Height: " +
                             this.getHeight() + " Area: " + this.getArea() +
                             " Perimeter: " + this.getPerimeter() + " Id: " +
                             this.getId();
        }

    }


