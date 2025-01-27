package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Apple extends Fruit {

    //Attribute
    private double speed;
    public int score;

    public Apple(double x, double y){
        super (x, y);
        radius = 30;
        score = 1;
        this.setNewImage("src/main/resources/graphic/apple.png");
    }

    @Override
    public void draw(DrawTool drawTool) {
        //drawTool.setCurrentColor(255,0,0,255);
        //drawTool.drawFilledCircle(x,y,radius);
        //drawTool.setCurrentColor(0,0,0,255);
        //drawTool.drawCircle(x,y,radius);

        drawTool.drawImage(this.getMyImage(), x-15, y-15);
    }


}
