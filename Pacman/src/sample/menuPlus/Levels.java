package sample.menuPlus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Levels {
    @FXML
    private Pane levelsPane;
    @FXML
    public void pressMenu(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        levelsPane.getChildren().setAll(pane);
    }
    @FXML
    public void level1(ActionEvent event) throws Exception{
        System.out.println("Marche pas car il n y a pas");
        /*Pane pane = FXMLLoader.load(getClass().getResource("level1.fxml"));
        levelsPane.getChildren().setAll(pane);*/
    }
}
