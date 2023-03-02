public abstract class Shape {
    //# Felter
    private String color;
    private boolean filled;

    private static int id  = 0;

    //# Konstruktører
    public Shape() {
        this("red", true);

    }

    public Shape(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        id++;

    }

    //# Getter-metoder
    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public int getId() {
        return id;
    }

    //# Setter-metoder
    private void setColor(String value) {
        this.color = value;
    }

    private void setFilled(boolean value) {
        this.filled = value;
    }

    public static void setId(int id) {

    }

    //# Metoder
    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ";filled=" + this.isFilled() + ";]";
    }

    public abstract double getArea();

    public abstract double getPerimeter();


}


