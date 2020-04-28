package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Pacman");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        final File file = new File("C:\\Users\\leogi\\Desktop\\pt s2\\Pac_man_leo\\src\\Assets\\son\\Skeleton_Dance_Remix.mp3");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.autoPlayProperty();
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
