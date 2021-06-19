package Mine;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game extends Application {
    private Map map;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Player myPlayer;
    private static String fileN = "";
    Tank player;
    private static String map1 = "map1.txt";
    private static String map2 = "map2.txt";
    private static String map3 = "map3.txt";


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter number between 1-3: ");
        int mapNumber = in.nextInt();
        if(mapNumber >= 1 && mapNumber <= 3) {
            if (mapNumber == 1)
                fileN = "Mine/res/map1.txt";
            else if (mapNumber == 2) fileN = "Mine/res/map2.txt";
            else if (mapNumber == 3) fileN = "Mine/res/map3.txt";
            launch(args);
        }
        else{
            System.out.println("Invalid Number!");
        }
    }


    public void setMap(Map nMap){

        map = nMap;

    }

    public void addPlayer(Player player){

        players.add(player);

    }

    public void start(Stage stage){
        try{
            map = new Map(fileN);
                player = new Tank(map);
            Scene scene = new Scene(map);
            stage.setResizable(false);
            stage.setTitle("Tanks");
            stage.setScene(scene);
            Bullet bullet = new Bullet(map);

            scene.setOnKeyPressed(e->{
                switch (e.getCode()){
                    case UP: player.moveUp();break;
                    case DOWN: player.moveDown();break;
                    case RIGHT: player.moveRight();break;
                    case LEFT: player.moveLeft();break;
                    case SPACE: bullet.shoot();break;
                }
            });


        } catch (InvalidMapException | FileNotFoundException e) { }

        stage.show();
    }
}
