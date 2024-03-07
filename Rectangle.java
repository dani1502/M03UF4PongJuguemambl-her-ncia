package cat.iticbcn.dsanchez;

import processing.core.PApplet;

import java.awt.*;


public class Rectangle extends Figura{


    private int base;

    private int alçada;
    private Point point;
    private Color color;

    private double vX;
    private double vY;

    public Rectangle(Point point, Color color, int base, int alçada, double vX, double vY){
        super(point,color);
        this.point = point;
        this.color = color;
        this.base = base;
        this.alçada= alçada;
        this.vX=vX;
        this.vY=vY;
    }





    public double area(){
        return base*alçada;
    }


    public double perimetre(){
        return (base*2) + (alçada*2);
    }


    public int getBase(){
        return base;
    }

    public int getAlçada(){
        return alçada;
    }


    public Point getPoint(){
        return point;
    }


    public Color getColor(){
        return color;
    }



    public void setBase(int base){
        this.base = base;
    }

    public void setAlçada(int alçada){
        this.alçada = alçada;
    }

    public void setPoint(Point point){
        this.point = point;
    }

    public void setColor( Color color){
        this.color = color;
    }


    public void draw(PApplet pApplet){
        pApplet.fill(getColor().getRGB());
        pApplet.rect(getPoint().x,getPoint().y,base,alçada);
    }

    public void move(PApplet pApplet) {
        if (pApplet != null) {
            int x = pApplet.mouseX - base / 2;
            int y = getPoint().y;
            x = PApplet.constrain(x, 0, pApplet.width - base);

            this.setPoint(new Point(x, y));
        }
    }



    @Override
    public String toString() {
        return "Rectangle { " +
                "base=" + base +
                "altura=" + alçada +
                ", point=" + point +
                ", color=" + color +
                '}';
    }
}
