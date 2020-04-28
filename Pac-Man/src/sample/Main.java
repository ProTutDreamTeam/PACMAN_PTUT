package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sample.levels.NiveauUn;

public class Main extends Application {
    public static MediaPlayer mp;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pacman");
        primaryStage.setScene(new Scene(root, 665.0, 479.0));
        primaryStage.show();

        String path = Main.class.getResource("/son/sonMenu.wav").toString();
        Media media = new Media(path);
        mp = new MediaPlayer(media);
        mp.setCycleCount(MediaPlayer.INDEFINITE);
        mp.play();

        NiveauUn.haut="A";

        System.out.println("Playing...");
    }
    /*@Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Pac Man");
        Group root = new Group();
        Group rootChoix = new Group();
        Group rootJeu = new Group();
        Scene sceneMenu = new Scene(root, 500, 400, Color.WHITE);
        Scene sceneChoix = new Scene(rootChoix, 500, 400, Color.WHITE);
        Scene sceneJeu = new Scene(rootJeu, 500, 500, Color.WHITE);
        Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/pac-font.ttf"),10);

        FontJeu fontJeu = new FontJeu();
        rootJeu.getChildren().add(fontJeu);

        FontMenu fontMenu = new FontMenu();
        root.getChildren().add(fontMenu);

        Pacman pac = new Pacman();
        rootJeu.getChildren().add(pac);

        Phantom ph1 = new Phantom();
        rootJeu.getChildren().add(ph1);

        Button btnDebut = new Button();
        btnDebut.setLayoutX(200);
        btnDebut.setLayoutY(200);
        btnDebut.setFont(font);
        btnDebut.setText("Start");
        btnDebut.setTextFill(Color.YELLOW);
        btnDebut.setBackground(null);
        btnDebut.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Lancement du jeu");
                primaryStage.setScene(sceneJeu);
                doCalculate(ph1,pac);
            }
        });
        root.getChildren().add(btnDebut);

        Button btnChoix = new Button();
        btnChoix.setLayoutX(200);
        btnChoix.setLayoutY(250);
        btnChoix.setFont(font);
        btnChoix.setText("Levels");
        btnChoix.setTextFill(Color.YELLOW);
        btnChoix.setBackground(null);
        btnChoix.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Lancement des choix");
                primaryStage.setScene(sceneChoix);
            }
        });
        root.getChildren().add(btnChoix);
        Button btnMulti = new Button();
        btnMulti.setLayoutX(200);
        btnMulti.setLayoutY(300);
        btnMulti.setFont(font);
        btnMulti.setText("Mutlti");
        btnMulti.setTextFill(Color.YELLOW);
        btnMulti.setBackground(null);
        btnMulti.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Le multijoueur");
            }
        });
        root.getChildren().add(btnMulti);
        Button btnQuitter = new Button();
        btnQuitter.setLayoutX(200);
        btnQuitter.setLayoutY(350);
        btnQuitter.setFont(font);
        btnQuitter.setText("Close");
        btnQuitter.setTextFill(Color.YELLOW);
        btnQuitter.setBackground(null);
        btnQuitter.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Quitter");
                primaryStage.close();
            }
        });
        root.getChildren().add(btnQuitter);

        Button btnRetour = new Button();
        btnRetour.setLayoutX(350);
        btnRetour.setLayoutY(350);
        btnDebut.setFont(font);
        btnRetour.setText("<Retour Menu");
        btnRetour.setTextFill(Color.YELLOW);
        btnRetour.setBackground(null);
        btnRetour.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Retout au menu");
                primaryStage.setScene(sceneMenu);
            }
        });
        rootChoix.getChildren().add(btnRetour);

        BoutonNiv[] boutons=new BoutonNiv[]{
                new BoutonNiv(110,100,1),
                new BoutonNiv(220,100,2),
                new BoutonNiv(330,100,3),
                new BoutonNiv(110,150,4),
                new BoutonNiv(220,150,5),
        };
        for (BoutonNiv bouton : boutons) {
            rootChoix.getChildren().add(bouton);
        }

        primaryStage.setScene(sceneMenu);
        primaryStage.show();
        pac.requestFocus();
    }

    private void doCalculate(Phantom ph1,Pacman pac) {

        final Service<Void> calculateService = new Service<Void>() {

            @Override
            protected Task<Void> createTask() {
                return new Task<Void>() {
                    int x=ph1.x;
                    int y=ph1.y;

                    @Override
                    protected Void call() throws Exception {
                        float maxIterations = 20000;
                        for (int i = 0; i < maxIterations; i++) {
                            for (int iterations = 0; iterations < maxIterations; iterations++) {

                            }
                        }
                        y -= 20;
                        ph1.setTranslateY(y + 50);
                        while(x!=pac.x||y!=pac.y) {
                            maxIterations = 20000;
                            if(pac.murs[(x+10)/10][y/10].valeur==0 && Math.random()>0.5){
                                x+=10;
                                ph1.setTranslateX(x+50);
                            }
                            else if(pac.murs[x/10][(y+10)/10].valeur==0 && Math.random()>0.5){
                                y+=10;
                                ph1.setTranslateY(y+50);
                            }
                            else if(pac.murs[(x-10)/10][y/10].valeur==0 && Math.random()>0.5){
                                x-=10;
                                ph1.setTranslateX(x+50);
                            }
                            else if(pac.murs[x/10][(y-10)/10].valeur==0 && Math.random()>0.5) {
                                y -= 10;
                                ph1.setTranslateY(y + 50);
                            }
                            for (int i = 0; i < maxIterations; i++) {
                                for (int iterations = 0; iterations < maxIterations; iterations++) {

                                }
                            }
                        }
                        System.out.println("Perdu");
                        return null;
                    }
                };
            }
        };
        calculateService.start();
    }*/


    public static void main(String[] args) {
        /*Audio son = new Audio();
        son.start();*/
        launch(args);
    }
}
