package sample;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FontMenu extends Parent {
    public FontMenu() {
        Image image = new Image("/assets/image/fond.png");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setFitWidth(500);
        iv1.setFitHeight(400);
        iv1.setX(0);
        iv1.setY(0);
        this.getChildren().add(iv1);
        TexteAfficher text1 =new TexteAfficher(85,50,"Menu Principale",Color.BLACK,25);
        this.getChildren().add(text1);
    }
}
