package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application {

    public static MediaPlayer mp;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pacman");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        String path = Main.class.getResource("/son/sonMenuS.mp3").toString();
        Media media = new Media(path);
        mp = new MediaPlayer(media);
        mp.setCycleCount(MediaPlayer.INDEFINITE);
        mp.play();

        //NiveauUn.haut="A";

        System.out.println("Playing...");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
