package sample.levels;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import sample.Main;

public class LevelUn {
    @FXML
    private Pane paneNiveauUn;

    @FXML
    private Arc pacman;

    public static String haut;

    @FXML
    public void retourMenu(ActionEvent event) throws Exception {
        System.out.println("Menu");
        Pane pane = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        paneNiveauUn.getChildren().setAll(pane);
    }

    @FXML
    public void deplacementPacman(KeyEvent ke){
        Main.pac1.deplacemnt(ke,pacman);
    }
}
