package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Pane paneMenu;
    @FXML
    private Text textMenuPacman;

    @FXML
    public void initialize() {
        textMenuPacman.setFont(Font.loadFont(getClass().getResourceAsStream("fonts/pac-font.ttf"),35));
    }

    @FXML
    public void pressStart(ActionEvent event) throws Exception {
        System.out.println("Level 1");
        Main.pac1.x=0;
        Main.pac1.y=0;
        Pane pane = FXMLLoader.load(getClass().getResource("levels/levelUn.fxml"));
        paneMenu.getChildren().setAll(pane);
    }

    @FXML
    public void pressCredits(ActionEvent event) throws Exception {
        System.out.println("credits");
        Pane pane = FXMLLoader.load(getClass().getResource("menuPlus/credits.fxml"));
        paneMenu.getChildren().setAll(pane);
    }

    @FXML
    public void pressOption(ActionEvent event) throws Exception {
        System.out.println("Option");
        Pane pane = FXMLLoader.load(getClass().getResource("menuPlus/option.fxml"));
        paneMenu.getChildren().setAll(pane);
    }

    @FXML
    public void pressLevels(ActionEvent event) throws Exception {
        System.out.println("Levels");
        Pane pane = FXMLLoader.load(getClass().getResource("menuPlus/levels.fxml"));
        paneMenu.getChildren().setAll(pane);
    }

    @FXML
    public void quitGame(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
}
