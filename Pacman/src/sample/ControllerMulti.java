package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerMulti {
    @FXML
    private Pane multiPane ;
    @FXML
    private void returnMulti(ActionEvent event) throws IOException {
        Pane rootPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        multiPane.getChildren().setAll(rootPane);
    }
}

