package main;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double computeArea() {
        return getWidth() * getHeight();
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}