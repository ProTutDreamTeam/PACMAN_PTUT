package sample.levels;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class NiveauUn {

    @FXML
    private Pane paneNiveauUn;

    @FXML
    private Circle pacman;

    public static String haut;

    @FXML
    public void retourMenu(ActionEvent event) throws Exception {
        System.out.println("menu");
        Pane pane = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        paneNiveauUn.getChildren().setAll(pane);
    }

    @FXML
    public void monte(KeyEvent ke){
        if(ke.getText().toUpperCase().equals(haut)){
            pacman.setTranslateX(10);
            System.out.println("toto");
        }
    }
}
