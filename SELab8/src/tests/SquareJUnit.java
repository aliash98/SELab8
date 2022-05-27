package tests;

import org.junit.Test;
import org.junit.Assert;
import main.Shape;
import main.Square;


public class SquareJUnit {
    @Test
    public void computeArea() {
        Shape square = new Square(8);
        double area = square.computeArea();
        Assert.assertEquals(64.0, area, 0.0);
    }

    @Test
    public void changeParameter() {
        Square square = new Square(7);
        square.setSide(4);
        Assert.assertEquals(4.0, square.getSide(), 0.0);
    }
}

