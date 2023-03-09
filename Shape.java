public abstract class Shape {
    //# Felter
    private String color;
    private boolean filled;

    private int id;

    //# Konstruktører
    public Shape() {
        this("red", true,1);
    }

    public Shape(String color, boolean filled, int id) {
        this.setColor(color);
        this.setFilled(filled);
        this.setId(id);

    }

    //# Getter-metoder
    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public int getId() {
        return this.id;
    }

    //# Setter-metoder
    private void setColor(String value) {
        this.color = value;
    }

    private void setFilled(boolean value) {
        this.filled = value;
    }

    public void setId(int id) {
        this.id = id;
    }

    //# Metoder
    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ";filled=" + this.isFilled() + ";]";
    }

    public abstract double getArea();

    public abstract double getPerimeter();


}


