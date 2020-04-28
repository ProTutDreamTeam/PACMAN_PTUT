package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private Pane MenuPane;

    @FXML
    public void pressStart(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("start.fxml"));
        MenuPane.getChildren().setAll(pane);
    }
}
