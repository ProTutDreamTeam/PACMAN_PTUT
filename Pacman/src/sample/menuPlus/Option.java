package sample.menuPlus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sample.Main;

public class Option {

    @FXML
    private Pane paneOption;

    @FXML
    public Slider sliderVolume;

    public static boolean musique = false;

    @FXML
    private TextField hautKeyField;

    @FXML
    public void retourMenu(ActionEvent event) throws Exception {
        System.out.println("menu");
        Pane pane = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        paneOption.getChildren().setAll(pane);
    }


    @FXML
    public void son(ActionEvent event) throws Exception{
        musique=!musique;
        System.out.println(musique);
        if(musique){
            Main.mp.pause();
        }else {
            Main.mp.play();
        }
    }

    @FXML
    public void volume(){
        Main.mp.setVolume(sliderVolume.getValue());
    }

    /*@FXML
    private void changeHaut(){
        NiveauUn.haut=hautKeyField.getText();
    }*/
}
