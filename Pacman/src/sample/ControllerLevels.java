package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerLevels implements Initializable {
    @FXML
    private Pane levelPane ;
    @FXML
    private void returnLevel(ActionEvent event) throws IOException {
        Pane rootPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        levelPane.getChildren().setAll(rootPane);
    }
    @FXML
    private ListView listLevel;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // change next line to DB load
        List<String> values = Arrays.asList("NIVEAU 1", "NIVEAU 2", "NIVEAU 3", "NIVEAU 4", "NIVEAU 5", "NIVEAU 6", "NIVEAU 7", "NIVEAU 8", "NIVEAU 9", "NIVEAU 10", "NIVEAU 11", "NIVEAU 12");
        listLevel.setItems(FXCollections.observableList(values));
    }

}
