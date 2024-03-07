package cat.iticbcn.dsanchez;

import java.awt.*;

public class Figura {
    private Point point;
    private Color color;


    public Figura(Point point, Color color) {
        this.point = point;
        this.color = color;
    }


    public Point getPoint() {
        return point;
    }


    public void setPoint(Point point) {
        this.point = point;
    }


    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Figura{" +
                "point=" + point +
                ", color=" + color +
                '}';
    }

}
