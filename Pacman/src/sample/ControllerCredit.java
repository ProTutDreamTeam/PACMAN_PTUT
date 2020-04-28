package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerCredit {
    @FXML
    private Pane creditPane ;
    @FXML
    private void returnCredit(ActionEvent event) throws IOException {
        Pane rootPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        creditPane.getChildren().setAll(rootPane);
    }
}
