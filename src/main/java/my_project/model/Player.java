package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.event.KeyEvent;

public class Player extends InteractiveGraphicalObject {


    //Attribute
    private double speed;
    public int points;

    //Tastennummern zur Steuerung
    private int keyToGoLeft;
    private int keyToGoRight;
    private int direction;

    public Player(double x, double y){
        this.x = x;
        this.y = y;
        speed = 150;
        width = 80;
        height = 40;
        points = 0;

        this.keyToGoLeft    = KeyEvent.VK_A;
        this.keyToGoRight   = KeyEvent.VK_D;
        this.direction      = -1; //-1 keine Bewegung, 0 nach rechts, 2 nach links
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(157,152,3,255);
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);

        drawTool.drawText(100,100, String.valueOf(this.points));
        //drawTool.setCurrentColor (0, 0, 0, 255);
        //drawTool.drawRectangle (100, 100, 100);
    }

    @Override
    public void update(double dt) {
        if(direction == 0){
            x = x + speed*dt;
            if (this.x>750){
                this.x=750;
            }
        }
        if(direction == 2){
            x = x - speed*dt;
            if (this.x<0){
                this.x=0;
            }
        }
    }

    @Override
    public void keyPressed(int key) {
        if(key == keyToGoLeft){
            direction = 2;
        }
        if(key == keyToGoRight){
            direction = 0;
        }
    }

    @Override
    public void keyReleased(int key) {
        if(key == keyToGoLeft){
            direction = -1;
        }
        if(key == keyToGoRight){
            direction = -1;
        }
    }
}
