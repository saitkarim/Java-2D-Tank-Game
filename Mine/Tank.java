package Mine;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class Tank {

    private static Map map;
    private static Position position;
    private static char[][] arr;
    private static int size,unit;
    private static char S = 'S';
    private static char B = 'B';
    private static char W = 'W';
    private static char T = 'T';
    private static Image image;
    private static ImageView put;
    private static Image tankUp = new Image("File:Mine/res/green-tank-up.gif", 30,30, false,false);
    private static Image tankDown = new Image("File:Mine/res/green-tank-down.gif", 30,30, false,false);
    private static Image tankLeft = new Image("File:Mine/res/green-tank-left.gif", 30,30, false,false);
    private static Image tankRight = new Image("File:Mine/res/green-tank-right.gif", 30,30, false,false);
    private static Bullet bullet;
    private static String moves;
    private static Circle circle;
    public Tank() {

    }

    public Tank(Map map ){

        this.map = map;
        arr = map.getArr();
        size = map.getSize();
        unit = map.getUnit();
        position = map.getPosition();
        bullet = new Bullet(map);
        circle = bullet.getBullet();
        put = new ImageView();
        put.setImage(tankUp);
        put.setX(position.getX()*unit + 5.4);
        put.setY(position.getY()*unit + 5.5);
        map.getChildren().addAll(put, circle);

    }

    public void setMap(Map map){

        this.map = map;

    }

    public void moveRight(){
        put.setImage(tankRight);
        moves = "Right";

        if(position.getX() < size - 1) {
            if(arr[(int)position.getX() + 1][(int)position.getY()] == '0' || arr[(int)position.getX() + 1][(int)position.getY()] == 'P'){
                position.setX(position.getX() + 1);
                put.setX(position.getX()*unit + 5.4);
                circle.setCenterX(position.getX()*unit + 20);
                System.out.println(moves);
            }
            else if (arr[(int)position.getX() + 1][(int)position.getY()] == S) {
                invalidPosition();
            }
            else if (arr[(int)position.getX() + 1][(int)position.getY()] == W) {
                invalidPosition();
            }
            else if (arr[(int)position.getX() + 1][(int)position.getY()] == T){
                position.setX(position.getX() + 1);
                put.setX(position.getX() * unit + 5.4);
                circle.setCenterX(position.getX()*unit + 20);
                put.setImage(null);
                System.out.println(moves);
            }
            else if (arr[(int)position.getX() + 1][(int)position.getY()] == B) {
                invalidPosition();
            }
        }
        else{
            invalidPosition();
        }
    }

    public void moveLeft(){
        put.setImage(tankLeft);
        moves = "Left";
        if(position.getX() > 0) {
            if(arr[(int) position.getX() - 1][(int) position.getY()] == '0' || arr[(int)position.getX() - 1][(int)position.getY()] == 'P'){
                position.setX(position.getX() - 1);
                put.setX(position.getX() * unit + 5.4);
                circle.setCenterX(position.getX()*unit + 20);
                System.out.println(moves);
            }
            else if (arr[(int) position.getX() - 1][(int) position.getY()] == S) {
                invalidPosition();
            }
            else if (arr[(int) position.getX() - 1][(int) position.getY()] == W) {
                invalidPosition();
            }
            else if (arr[(int) position.getX() - 1][(int) position.getY()] == T){
                position.setX(position.getX() - 1);
                put.setX(position.getX() * unit + 5.4);
                circle.setCenterX(position.getX()*unit + 20);
                put.setImage(null);
                System.out.println(moves);
            }
            else if (arr[(int) position.getX() - 1][(int) position.getY()] == B) {
                invalidPosition();
            }
        }
        else{
            invalidPosition();
        }
    }

    public void moveUp(){
        put.setImage(tankUp);
        moves = "Up";

        if(position.getY() > 0) {
            if(arr[(int)position.getX()][(int)position.getY() - 1] == '0' || arr[(int)position.getX()][(int)position.getY() - 1] == 'P'){
                position.setY(position.getY() - 1);
                put.setY(position.getY()*unit + 5.5);
                circle.setCenterY(position.getY()*unit + 20);
                System.out.println(moves);
            }
            else if (arr[(int)position.getX()][(int)position.getY() - 1] == S) {
                invalidPosition();
            }
            else if (arr[(int)position.getX()][(int)position.getY() - 1] == W) {
                invalidPosition();
            }
            else if (arr[(int)position.getX()][(int)position.getY() - 1] == T){
                position.setY(position.getY() - 1);
                put.setY(position.getY()*unit + 5.5);
                circle.setCenterY(position.getY()*unit + 20);
                put.setImage(null);
                System.out.println(moves);
            }
            else if (arr[(int)position.getX()][(int)position.getY() - 1] == B) {
                invalidPosition();
            }
        }
        else{
            invalidPosition();
        }
    }

    public void moveDown() {
        put.setImage(tankDown);
        moves = "Down";

        if(position.getY() < size - 1) {
            if(arr[(int)position.getX()][(int)position.getY() + 1] == '0' || arr[(int)position.getX()][(int)position.getY() + 1] == 'P'){
                position.setY(position.getY() + 1);
                put.setY(position.getY()*unit + 5.5);
                circle.setCenterY(position.getY()*unit + 20);
                System.out.println(moves);
            }
            else if (arr[(int)position.getX()][(int)position.getY() + 1] == S) {
                invalidPosition();
            }
            else if (arr[(int)position.getX()][(int)position.getY() + 1] == W) {
                invalidPosition();
            }
            else if (arr[(int)position.getX()][(int)position.getY() + 1] == T){
                position.setY(position.getY() + 1);
                put.setY(position.getY()*unit + 5.5);
                circle.setCenterY(position.getY()*unit + 20);
                put.setImage(null);
                System.out.println(moves);
            }
            else if (arr[(int)position.getX()][(int)position.getY() + 1] == B) {
                invalidPosition();
            }
        }
        else{
            invalidPosition();
        }
    }

    public Position getPosition(){

        return position;

    }

    public String getMoves(){
        return moves;
    }

    public void invalidPosition(){
        System.out.println("Invalid Position!");
    }
}
