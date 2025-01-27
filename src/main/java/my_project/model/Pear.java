package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Pear extends Fruit {

    //Attribute
    private double speed;
    public double score;

    public Pear (double x, double y){
        super (x, y);
        width = 25;
        height = 35;
        score = 2;
        this.setNewImage("src/main/resources/graphic/pear.png");
    }

    @Override
    public void draw(DrawTool drawTool) {
        //drawTool.setCurrentColor(0,255,0,255);
        //drawTool.drawFilledRectangle(x,y,width,height);
        //drawTool.setCurrentColor(0,0,0,255);
        //drawTool.drawRectangle(x,y,width,height);

        drawTool.drawImage(this.getMyImage(), x, y);
    }

}

