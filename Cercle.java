package cat.iticbcn.dsanchez;


import processing.core.PApplet;


import java.awt.*;


public class Cercle extends Figura {
    private int radi;


    public Cercle(Point point, Color color, int radi) {
        super(point, color);
        this.radi = radi;
    }


    public int getRadi() {
        return radi;
    }


    public void setRadi(int radi) {
        this.radi = radi;
    }


    public void draw(PApplet pApplet){
        pApplet.fill(getColor().getRGB());
        pApplet.ellipse(getPoint().x, getPoint().y, radi * 2, radi * 2);
    }


}

