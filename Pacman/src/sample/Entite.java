package sample;

public class Entite {
    private int x,y;

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
        this.
    }
}
