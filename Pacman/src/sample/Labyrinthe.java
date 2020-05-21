package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrinthe {
    private ArrayList<Entite> entites;
    private  ArrayList<ArrayList<LegendeLabyrinthe>> grid;
    public Labyrinthe(){
        this.entites = new ArrayList<>();
        this.grid = new ArrayList<>();
    }

    public void addEntite(Entite entite){
        this.entites.add(entite);
    }
    public void readMaze(){
        try {
            File level = new File("level1");
            Scanner l = new Scanner(level);
            while (l.hasNextLine()) {
                String data = l.nextLine();
                this.grid.add(new ArrayList<>());
                for(int c = 0; c < data.length(); c++) {
                    this.grid.get(this.grid.size()-1).add(LegendeLabyrinthe.intToLegendeLabyrinthe(Integer.parseInt(data.charAt(c) + "")));
                }
            }
            l.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void checkColison(){

    }
}