package sample;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Mur extends Parent {
    public int valeur,x,y;
    public Mur(int x,int y,int casse) {
        valeur=casse;
        if(casse == 1) {
            Rectangle mur = new Rectangle();
            mur.setWidth(10);
            mur.setHeight(10);
            mur.setFill(Color.BLUE);
            mur.setTranslateX(x);
            mur.setTranslateY(y);
            this.getChildren().add(mur);
        }else
        {
            Rectangle mur = new Rectangle();
            mur.setWidth(10);
            mur.setHeight(10);
            mur.setFill(Color.WHITE);
            mur.setTranslateX(x);
            mur.setTranslateY(y);
            this.getChildren().add(mur);
        }
    }

}
