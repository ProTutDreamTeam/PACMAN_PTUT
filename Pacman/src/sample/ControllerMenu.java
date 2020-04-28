package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


import javax.swing.plaf.nimbus.State;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class ControllerMenu {

    @FXML
    private Pane rootPane;

    @FXML
    private void showStart(ActionEvent event) throws IOException {
        Pane menuPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        rootPane.getChildren().setAll(menuPane);
    }

    @FXML
    private void showLevels(ActionEvent event) throws IOException {
        Pane levelPane = FXMLLoader.load(getClass().getResource("Levels.fxml"));
        rootPane.getChildren().setAll(levelPane);
    }

    @FXML
    private void showMulti(ActionEvent event) throws IOException {
        Pane multiPane = FXMLLoader.load(getClass().getResource("Multi.fxml"));
        rootPane.getChildren().setAll(multiPane);

    }
    @FXML
    private void showCredits(ActionEvent event) throws IOException {
        Pane creditPane = FXMLLoader.load(getClass().getResource("credit.fxml"));
        rootPane.getChildren().setAll(creditPane);
    }


    File file = new File("C:\\Users\\axell\\Documents\\JAVAWORK\\Pacman\\src\\assets\\music\\MusMenuFinal.mp3");
    Media media = new Media(file.toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    CheckBox mute = new CheckBox();
    boolean check = mute.isSelected();
    @FXML
    public void musique(ActionEvent event) throws  IOException{
        mediaPlayer.setAutoPlay(true);

    }
    @FXML
    public void restartGame(ActionEvent event)throws IOException{


    }
    public void quitGame(ActionEvent event) throws IOException{
        Platform.exit();
        System.exit(0);
     }




}

