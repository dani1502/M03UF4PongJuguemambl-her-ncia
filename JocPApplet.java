package cat.iticbcn.dsanchez;


import cat.iticbcn.dsanchez.Pilota;
import processing.core.PApplet;


import java.awt.*;


public class JocPApplet extends PApplet {


    private Pilota pilota;
    private Rectangle rectangle;


    /**
     * Abans de construir el PApplet
     */
    @Override
    public void settings() {
        this.size(1000, 600);
    }


    /**
     * Ja tenim la finestra. Ja hi podem dibuixar coses
     *
     */
    @Override
    public void setup() {
        pilota = new Pilota(new Point(0, 0), Color.RED, 20, 5, 10);
        rectangle = new Rectangle(new Point(500,550),Color.YELLOW,100,20,10,0);
        background(0);
    }



    @Override
    public void draw() {
        background(0);
        pilota.move(this);
        if (pilota.getPoint().getY() + pilota.getRadi() >= height) {
            setup();
        }
        if (pilota.colisiona(rectangle)) {
            pilota.setVY(pilota.getVY() * -1);
        }
        pilota.draw(this);
        rectangle.draw(this);
        rectangle.move(this);
        //this.ellipse(mouseX, mouseY, 100, 100);
    }



    public static void main(String[] args) {
        JocPApplet pApplet = new JocPApplet();


        PApplet.runSketch(new String[] {"bon", "dia"},
                pApplet);
    }
}
