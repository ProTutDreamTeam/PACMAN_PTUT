package sample;

import javafx.scene.Parent;

public class Murs extends Parent {
    Mur[][] murs =new Mur[20][20];
    public  Murs(){
        for (int i = 5; i < 25; i++) {
            for (int j = 5; j < 25; j++) {
                if(Math.random()>0.5){
                    murs[i][j]=new Mur(i*10,j*10, 1);
                }else{
                    murs[i][j]=new Mur(i*10,j*10, 0);
                }
            }
        }
    }
}
