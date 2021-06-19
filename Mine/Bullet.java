package Mine;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Bullet extends Tank{

    private static Image bulletUp_img = new Image("File:Mine/res/missile-up.gif");
    private static Image bulletDown_img = new Image("File:Mine/res/missile-down.gif");
    private static Image bulletLeft_img = new Image("File:Mine/res/missile-left.gif");
    private static Image bulletRight_img = new Image("File:Mine/res/missile-right.gif");
    private static Map map;
    private static Position position;
    private static Tank tank;
    private static char[][] arr;
    private static int size,unit;
    private static int row;
    private static int col;
    private static ImageView bull = new ImageView();
    private static Circle circle;
    private static char S = 'S';
    private static char B = 'B';
    private static char W = 'W';
    private static char T = 'T';
    private Timeline animation;

    Bullet(Map map){

        arr = map.getArr();
        size = map.getSize();
        unit = map.getUnit();
        position = map.getPosition();
        circle = new Circle(position.getX() * unit + 20, position.getY() * unit +20, 2, Color.BLUE);

    }

    public Circle getBullet(){
        return circle;
    }

    public void shoot(){
        System.out.println("Fire!");
        if(getMoves() == "Right") {

        }
        else if(getMoves() == "Left"){

        }
        else if(getMoves() == "Up"){

        }
        else if(getMoves() == "Down"){

        }
    }
    public void play(){
        animation.play();
    }

    public void pause(){
        animation.pause();
    }

    public void increaseSpeed(){
        animation.setRate(animation.getRate()+ 0.1);
    }

    public void decreaseSpeed() {
        animation.setRate(
                animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }

}
