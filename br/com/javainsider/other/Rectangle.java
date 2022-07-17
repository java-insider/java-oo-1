package br.com.javainsider.other;

public class Rectangle {

    private final double width;
    private final double height;
    private final double square;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        square = width * height;
    }

    public Rectangle(double width) {
        this(width, width);
    }

    public double square() {
        return square;
    }
}
