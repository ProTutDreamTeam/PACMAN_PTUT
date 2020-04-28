package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class ControllerStart {
    @FXML
    private Pane StartPane;
    @FXML
    public void pressMenu(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        StartPane.getChildren().setAll(pane);
    }
}
