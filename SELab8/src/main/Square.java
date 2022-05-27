package main;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.setSide(side);
    }

    public double computeArea() {
        return getSide() * getSide();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



}
