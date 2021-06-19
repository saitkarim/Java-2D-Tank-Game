package Mine;


public class Position {
    private double x;
    private double y;
    private boolean isequal = false;

    public Position(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double newX){
        x = newX;
    }
    public void setY(double newY){
        y = newY;
    }
    public boolean equals(Position position){
        if(position.getY() == getY() && position.getX() == getX()){
            isequal = true;
        }else isequal = false;
        return isequal;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }


}
