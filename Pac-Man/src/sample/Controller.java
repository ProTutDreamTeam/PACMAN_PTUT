package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Pane paneMenu;

    @FXML
    public void pressStart(ActionEvent event) throws Exception {
        System.out.println("start");
        Pane pane = FXMLLoader.load(getClass().getResource("levels/niveauUn.fxml"));
        paneMenu.getChildren().setAll(pane);
    }

    @FXML
    public void pressCredits(ActionEvent event) throws Exception {
        System.out.println("credits");
        Pane pane = FXMLLoader.load(getClass().getResource("menuEnPlus/credits.fxml"));
        paneMenu.getChildren().setAll(pane);
    }

    @FXML
    public void pressOption(ActionEvent event) throws Exception {
        System.out.println("Option");
        Pane pane = FXMLLoader.load(getClass().getResource("menuEnPlus/option.fxml"));
        paneMenu.getChildren().setAll(pane);
    }
}
