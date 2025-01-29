package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public abstract class  Fruit extends GraphicalObject {

    //Attribute
    private double speed;

    public Fruit(double x, double y){
        this.x = x;
        this.y = y;
        speed = 150;

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