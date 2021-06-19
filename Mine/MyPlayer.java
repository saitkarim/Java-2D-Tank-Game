package Mine;

public class MyPlayer implements Player {

    private Map map;
    private static Position position;
    private static char[][] arr;
    private static int size;
    private static double row;
    private static double col;

    public MyPlayer() {

    }

    public MyPlayer(Map map ){

        this.map = map;
        arr = map.getArr();
        size = map.getSize();
        position = map.getPosition();
        col = position.getX();
        row = position.getY();
        position.setX(col);
        position.setY(row);

    }

    public void setMap(Map map){

        this.map = map;

    }

    public void moveRight(){

        if(position.getX() < size - 1 && arr[(int)position.getX() + 1][(int)position.getY()] != '1'){
            position.setX(position.getX() + 1);
        }

    }

    public void moveLeft(){

        if(position.getX() > 0 && arr[(int)position.getX() - 1][(int)position.getY()] != '1'){
            position.setX(position.getX() - 1);
        }

    }

    public void moveUp(){

        if(position.getY() > 0 && arr[(int)position.getX()][(int)position.getY() - 1] != '1'){
            position.setY(position.getY() - 1);
        }

    }

    public void moveDown() {

        if (position.getY() < size - 1 && arr[(int)position.getX()][(int)position.getY() + 1] != '1') {
            position.setY(position.getY() + 1);
        }

    }

    public Position getPosition(){

        return position;

    }
}
