package sample;

public class Entite {
    private int x,y;
    private Direction steerVector;
    private Double speed;

    public Entite(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void translate(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }

    public Direction getSteerVector() {
        return steerVector;
    }

    public void setSteerVector(Direction steerVector) {
        this.steerVector = steerVector;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }


}
