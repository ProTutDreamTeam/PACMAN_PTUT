package sample;

import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Arc;


public class Pacman {
    public int x=0,y=0;

    public void deplacemnt(KeyEvent ke, Arc pacman){
        if(ke.getText().toUpperCase().equals("D")){
            x+=5;
            pacman.setTranslateX(x);
        }
        if(ke.getText().toUpperCase().equals("S")){
            y+=5;
            pacman.setTranslateY(y);
        }
        if(ke.getText().toUpperCase().equals("Q")){
            x-=5;
            pacman.setTranslateX(x);
        }
        if(ke.getText().toUpperCase().equals("Z")){
            y-=5;
            pacman.setTranslateY(y);
        }
    }

}
