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
    
    //# Getter-metoder
    public double getWidth() {
        return this.width;
    }

    //# Setter-metoder
    public void setHeight(double value) {
        this.height = value;
    }
    
    //# Metoder
    // Regn ut areal
    public double getArea() {
        return width*height;
    }

    // Regn ut omkrets
    public double getPerimeter() {

        return (width*2)*(height*2);
    }

    @Override
    public String toString() {
            return
                    "Square[color =" + this.getColor() +
                    "filled =" + this.isFilled() + ";]" + "Height =" + this.getHeight() + "Width =" +this.getWidth() + "area = " + this.getArea() + "width =" + this.getWidth() ;
        }

    }


