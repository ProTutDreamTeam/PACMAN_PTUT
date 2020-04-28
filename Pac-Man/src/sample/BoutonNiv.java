package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class BoutonNiv extends Parent {
    public BoutonNiv(double posX,double posY,int niv) {

        Button btn = new Button();
        btn.setLayoutX(posX);
        btn.setLayoutY(posY);
        btn.setText("Niveau "+niv);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Lancement du niveau " +niv);
            }
        });
        this.getChildren().add(btn);
    }
}
