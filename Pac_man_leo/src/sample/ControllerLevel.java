package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class ControllerLevel {
    @FXML
    private Pane LevelPane;
    @FXML
    public void pressMenu(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        LevelPane.getChildren().setAll(pane);
    }
    @FXML
    public void level1(ActionEvent event) throws Exception{
        Pane pane = FXMLLoader.load(getClass().getResource("level1.fxml"));
        LevelPane.getChildren().setAll(pane);
    }
}
