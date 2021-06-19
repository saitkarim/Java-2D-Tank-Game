package Mine;

import java.util.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import java.io.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Map extends Pane{
    private int size,unit;
    private char[][] arr;
    private int col;
    private int row;
    private Position position;
    private char S = 'S';
    private char B = 'B';
    private char W = 'W';
    private char T = 'T';
    private static Image imgS = new Image("File:Mine/res/Battle_City_wall.png", 40,40, false,false);
    private static Image imgB = new Image("File:Mine/res/Battle_City_bricks.png", 40,40, false,false);
    private static Image imgW = new Image("File:Mine/res/Battle_City_water.png", 40,40, false,false);
    private static Image imgT = new Image("File:Mine/res/Battle_City_trees.png", 40,40, false,false);



    public Map(String fileN) throws InvalidMapException, FileNotFoundException {
        unit = 40;
        Scanner in = new Scanner(new File(fileN));
        size = in.nextInt();
        arr = new char[size][size];
        position = getPosition();
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                arr[j][i] = in.next().charAt(0);
                if (arr[j][i] == 'P') {

                    col = i;
                    row = j;
                    position = new Position(row, col);
                }
                ImageView put = new ImageView();
                Rectangle r = new Rectangle(j*unit,i*unit,unit,unit);

                getChildren().addAll(r, put);

                if (arr[j][i]=='0' || arr[j][i]=='P'){
                    r.setFill(Color.BLACK);
                    r.setStroke(Color.WHITE);
                    r.setStrokeWidth(0.3);
                }
                else if(arr[j][i]== S) {
                    put.setX(j*unit);
                    put.setY(i*unit);
                    put.setImage(imgS);
                }
                else if(arr[j][i]== B) {
                    put.setImage(imgB);
                    put.setX(j*unit);
                    put.setY(i*unit);
                }
                else if(arr[j][i]== W) {
                    put.setImage(imgW);
                    put.setX(j*unit);
                    put.setY(i*unit);
                }
                else if(arr[j][i]== T) {
                    put.setImage(imgT);
                    put.setX(j*unit);
                    put.setY(i*unit);
                }




            }
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int nSize) {
        size = nSize;
    }

    public int getUnit(){
        return unit;
    }

    public char getValueAt(int x, int y) {

        return arr[x][y];

    }

    public void print() {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print(arr[j][i] + " ");

            }

            System.out.println();

        }

    }

    public char[][] getArr() {

        return arr;

    }

    public Position getPosition() {
        return position;
    }
}
