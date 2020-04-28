package sample;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pacman extends EnsembleMur {
    public int x,y;
    public Pacman() {
        x=70;
        y=70;
        Image image = new Image("/assets/image/pac.png");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setFitWidth(18);
        iv1.setFitHeight(18);
        iv1.setX(0);
        iv1.setY(0);
        this.getChildren().add(iv1);

        this.setOnKeyPressed (new EventHandler<KeyEvent>(){
            public void handle(KeyEvent ke){
                if(ke.getText().toUpperCase().equals("D") /*&& murs[(x+10)/10][y/10].valeur==0*/){
                    x+=5;
                    iv1.setTranslateX(x+50);
                    x+=5;
                    iv1.setTranslateX(x+50);
                }
                if(ke.getText().toUpperCase().equals("S") /*&& murs[x/10][(y+10)/10].valeur==0*/){
                    y+=5;
                    iv1.setTranslateY(y+50);
                    y+=5;
                    iv1.setTranslateY(y+50);
                }
                if(ke.getText().toUpperCase().equals("Q") /*&& murs[(x-10)/10][y/10].valeur==0*/){
                    x-=5;
                    iv1.setTranslateX(x+50);
                    x-=5;
                    iv1.setTranslateX(x+50);
                }
                if(ke.getText().toUpperCase().equals("Z") /*&& murs[x/10][(y-10)/10].valeur==0*/){
                    y-=5;
                    iv1.setTranslateY(y+50);
                    y-=5;
                    iv1.setTranslateY(y+50);
                }
            }
        });
    }
}
