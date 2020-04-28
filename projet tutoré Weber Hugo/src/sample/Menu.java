package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static javafx.geometry.Pos.*;

public class Menu extends Application {

    Stage window;
    Scene scene, sceneCredit;

    @Override
    public void start(Stage theStage) throws FileNotFoundException {

        window = theStage;
        window.setTitle("SUPER PAC-MAN");

        //Main menu
        Label title = new Label("Super Pac-Man");
        title.setStyle("-fx-text-fill: yellow;");
        title.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 35));
        Button btnStart = new Button("Start");
        btnStart.setStyle("-fx-text-fill: yellow; -fx-background-color: black;");
        btnStart.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 20));
        Button btnLevel = new Button("Level");
        btnLevel.setStyle("-fx-text-fill: yellow; -fx-background-color: black;");
        btnLevel.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 20));

        Button btnMult = new Button("Multiplayer");
        btnMult.setStyle("-fx-text-fill: yellow; -fx-background-color: black;");
        btnMult.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 20));

        Button btnCredit = new Button("Credit");
        btnCredit.setStyle("-fx-text-fill: yellow; -fx-background-color: black;");
        btnCredit.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 20));
        btnCredit.setOnAction(e -> window.setScene(sceneCredit));

        Button btnExit = new Button("Exit");
        btnExit.setStyle("-fx-text-fill: yellow; -fx-background-color: black;");
        btnExit.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 20));
        btnExit.setOnAction(e -> theStage.close());

        //FileInputStream inputRG = new FileInputStream("resources/images/Red-Ghost.png");
        //Image imageRG = new Image(inputRG);
        //ImageView imageViewRG= new ImageView(imageRG);
        //imageViewRG.setFitWidth(50);
        //imageViewRG.setFitHeight(50);

        //HBox hBoxR= new HBox(imageViewRG);
        //hBoxR.setAlignment(CENTER_LEFT);

        //FileInputStream inputBG = new FileInputStream("resources/images/Blue-Ghost.jpg");
        //Image imageBG = new Image(inputBG);
        //ImageView imageViewBG = new ImageView(imageBG);
        //imageViewBG.setFitHeight(50);
        //imageViewBG.setFitWidth(50);

        //HBox hBoxB= new HBox(imageViewBG);
        //hBoxB.setAlignment(BOTTOM_LEFT);

        //FileInputStream inputPG = new FileInputStream("resources/images/Pink-Ghost.jpg");
        //Image imagePG = new Image(inputPG);
        //ImageView imageViewPG = new ImageView(imagePG);
        //imageViewPG.setFitHeight(50);
        //imageViewPG.setFitWidth(50);

        //HBox hBoxP= new HBox(imageViewPG);
        //hBoxP.setAlignment(BOTTOM_RIGHT);

        //FileInputStream inputOG = new FileInputStream("resources/images/Orange-Ghost.jpg");
        //Image imageOG = new Image(inputOG);
        //ImageView imageViewOG = new ImageView(imageOG);
        //imageViewOG.setFitWidth(50);
        //imageViewOG.setFitHeight(50);

        //HBox hBoxO= new HBox(imageViewOG);
        //hBoxO.setAlignment(CENTER_RIGHT);

        //FileInputStream inputPM = new FileInputStream("resources/images/Pac-Man.png");
        //Image imagePM = new Image(inputPM);
        //ImageView imageViewPM = new ImageView(imagePM);
        //imageViewPM.setFitHeight(70);
        //imageViewPM.setFitWidth(70);

        //HBox hBoxPM= new HBox(imageViewPM);
        //hBoxPM.setAlignment(BOTTOM_CENTER);

        VBox layout = new VBox(15, title, btnStart, btnLevel, btnMult, btnCredit, btnExit);
        layout.setAlignment(Pos.CENTER);

        GridPane mainMenu = new GridPane();
        mainMenu.setStyle("-fx-background-color: black");
        mainMenu.setPadding(new Insets(25,25,25,25));
        mainMenu.setHgap(20);
        mainMenu.setHgap(20);
        mainMenu.setAlignment(CENTER);
        mainMenu.getChildren().addAll(layout);
        scene = new Scene(mainMenu, 700, 550);

        // Credit
        Text chef = new Text("Producer : Leo GICQUEL");
        chef.setFill(Color.YELLOW);
        chef.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 15));
        Text sound = new Text("Sound and design : Colin");
        sound.setFill(Color.YELLOW);
        sound.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 15));
        Text program = new Text("programmation : Hugo WEBER and Axlloren");
        program.setFill(Color.YELLOW);
        program.setFont(Font.loadFont("file:resources/fonts/press-start-2p/PressStart2P-Regular.ttf", 15));
        Button btnReturn = new Button("Return to main menu");
        btnReturn.setOnAction(e -> window.setScene(scene));

        VBox layoyt2 = new VBox(chef, sound, program, btnReturn);
        layoyt2.setAlignment(CENTER);

        StackPane credit = new StackPane();
        credit.setStyle("-fx-background-color: black");
        credit.setAlignment(CENTER);
        credit.getChildren().add(layoyt2);
        sceneCredit = new Scene(credit, 600, 300);


        //Window
        window.setOnCloseRequest(e -> Platform.exit());
        window.setScene(scene);
        window.show();

    }
}
