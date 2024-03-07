package cat.iticbcn.dsanchez;


import processing.core.PApplet;


import java.awt.*;


public class Pilota extends Cercle {
    private double vX;
    private double vY;


    public Pilota(Point point, Color color, int radi, double vX, double vY) {
        super(point, color, radi);
        this.vX = vX;
        this.vY = vY;
    }


    public void move(PApplet pApplet){
        int x = getPoint().x;
        int y = getPoint().y;
        x+= (int) vX;
        y+= (int) vY;

        if (x + getRadi() >= pApplet.width) {
            x = pApplet.width - getRadi() - 1;
            vX *= -1;

        } else if (x - getRadi() <= 0) {
            x = getRadi() + 1;
            vX *= -1;
        }

        if (y - getRadi() <= 0) {
            y = getRadi() + 1;
            vY *= -1;
        }


        this.setPoint(new Point(x, y));


    }
    public boolean colisiona(Rectangle rectangle) {
        int rectX1 = rectangle.getPoint().x;
        int rectY1 = rectangle.getPoint().y;
        int rectX2 = rectX1 + rectangle.getBase();
        int rectY2 = rectY1 + rectangle.getAlçada();

        return (getPoint().x + getRadi() >= rectX1 && getPoint().x - getRadi() <= rectX2 &&
                getPoint().y + getRadi() >= rectY1 && getPoint().y - getRadi() <= rectY2);
    }
    public void setVY(double newVY) {
        this.vY = newVY;
    }
    public double getVY() {
        return vY;
    }



}
