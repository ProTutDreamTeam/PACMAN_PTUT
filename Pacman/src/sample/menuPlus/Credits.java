package sample.menuPlus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Credits {

    @FXML
    private Pane paneCredits;

    @FXML
    public void retourMenu(ActionEvent event) throws Exception {
        System.out.println("menu");
        Pane pane = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        paneCredits.getChildren().setAll(pane);
    }
}
