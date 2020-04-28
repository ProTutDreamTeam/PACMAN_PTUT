package sample;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TexteAfficher extends Parent {
    public TexteAfficher(double posX,double posY,String texte, Color couleur,int style) {
        Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/pac-font.ttf"), style);

        Text lettre = new Text();
        lettre.setText(texte);
        lettre.setFont(font);
        lettre.setFill(couleur);
        lettre.setX(posX);
        lettre.setY(posY);
        lettre.setFill(Color.YELLOW);
        this.getChildren().add(lettre);
    }


}
