package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Apple extends GraphicalObject {

    //Attribute
    private double speed;

    public Apple(double x, double y){
        this.x = x;
        this.y = y;
        speed = 150;
        radius = 30;
        this.setNewImage("src/main/resources/graphic/apple.png");
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255,0,0,255);
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawCircle(x,y,radius);

        drawTool.drawImage(this.getMyImage(), x, y);
    }

    @Override
    public void update(double dt) {
        this.y = this.y + speed*dt;
        if (this.y > 800){
            this.jumpBack();
        }
    }
    public void jumpBack() {
        this.y = 0;
        this.x = 800*Math.random();
    }
}
