package sample;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FontJeu extends Parent {
    int score,vie;
    public FontJeu() {
        Rectangle ft = new Rectangle();
        ft.setWidth(600);
        ft.setHeight(600);
        ft.setFill(Color.BLACK);
        this.getChildren().add(ft);
        vie=3;
        TexteAfficher text1 = new TexteAfficher(30,30,"Score: "+score,Color.WHITE,10);
        TexteAfficher text2 = new TexteAfficher(120,30,vie+"UP",Color.WHITE,10);
        TexteAfficher text3 = new TexteAfficher(200,30,"Score max: "+score,Color.WHITE,10);
        this.getChildren().add(text1);
        this.getChildren().add(text2);
        this.getChildren().add(text3);
        Image image = new Image("/assets/image/fontmodif.png");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setFitWidth(400);
        iv1.setFitHeight(400);
        iv1.setX(50);
        iv1.setY(50);
        this.getChildren().add(iv1);
    }
}
