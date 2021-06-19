package Mine;

public interface Player {
    public void moveRight();
    public void moveLeft();
    public void moveUp();
    public void moveDown();
    public void setMap(Map map);
    public Position getPosition();

}
