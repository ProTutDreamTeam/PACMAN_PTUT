package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerStart{
    @FXML
    private Pane startPane ;
    @FXML
    private void returnStart(ActionEvent event) throws IOException {
        Pane rootPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        startPane.getChildren().setAll(rootPane);
    }
}

