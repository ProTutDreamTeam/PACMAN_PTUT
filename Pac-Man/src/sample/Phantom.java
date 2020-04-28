package sample;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Phantom extends Parent {
    public int x,y;
    public Phantom() {
        x=90;
        y=90;
        Rectangle ph = new Rectangle();
        ph.setWidth(10);
        ph.setHeight(10);
        ph.setFill(Color.RED);
        this.setTranslateX(x+50);
        this.setTranslateY(y+50);
        this.getChildren().add(ph);
    }
}
