package sample.levels;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import sample.Pacman;

public class LevelUn {
    @FXML
    private Pane paneNiveauUn;

    @FXML
    private Arc pacman;

    public static String haut;
    public static Pacman pac1 = new Pacman(0,0);

    @FXML
    public void retourMenu(ActionEvent event) throws Exception {
        System.out.println("Menu");
        Pane pane = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        paneNiveauUn.getChildren().setAll(pane);
    }

    @FXML
    public void deplacementPacman(KeyEvent ke){
        switch (ke.getText().toUpperCase()){
            case "D":
                pac1.translate(10,0);
                pacman.setTranslateX(pac1.getX());
                break;
            case "S":
                pac1.translate(0,10);
                pacman.setTranslateY(pac1.getY());
                break;
            case "Q":
                pac1.translate(-10,0);
                pacman.setTranslateX(pac1.getX());
                break;
            case "Z":
                pac1.translate(0,-10);
                pacman.setTranslateY(pac1.getY());
                break;
        }
    }
}
