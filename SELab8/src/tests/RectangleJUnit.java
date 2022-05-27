package tests;

import main.Rectangle;
import org.junit.Test;
import main.Shape;
import org.junit.Assert;

public class RectangleJUnit {
    @Test
    public void computeArea(){
        Shape rectangle = new Rectangle(7, 3);
        double area = rectangle.computeArea();
        Assert.assertEquals(21.0, area, 0.0);
    }

    @Test
    public void changeWidth() {
        Rectangle rectangle = new Rectangle(9, 4);
        rectangle.setWidth(7);
        Assert.assertEquals(7, rectangle.getWidth(), 0.0);
    }

    @Test
    public void changeHeight() {
        Rectangle rectangle = new Rectangle(3, 14);
        rectangle.setHeight(9);
        Assert.assertEquals(9, rectangle.getHeight(), 0.0);
    }
}

