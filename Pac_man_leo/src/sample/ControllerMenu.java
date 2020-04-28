package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.awt.*;
import java.io.File;


public class ControllerMenu {
    @FXML
    private Pane MenuPane;

    @FXML
    public void pressStart(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        MenuPane.getChildren().setAll(pane);
    }
    @FXML
    public void pressLevel(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Level.fxml"));
        MenuPane.getChildren().setAll(pane);
    }
    @FXML
    public void pressMulti(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Multi.fxml"));
        MenuPane.getChildren().setAll(pane);
    }
    @FXML
    public void pressCredit(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("Credit.fxml"));
        MenuPane.getChildren().setAll(pane);
    }
    @FXML
    public void Mute(ActionEvent event) throws  Exception{
        Checkbox mute = new Checkbox();


    }
}