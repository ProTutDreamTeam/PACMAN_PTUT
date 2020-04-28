package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class ControlleurMulti {
    @FXML
    private Pane MultiPane;
    @FXML
    private void pressMenu(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        MultiPane.getChildren().setAll(pane);
    }
}
