package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrinthe {
    public static void level(){
        ArrayList<ArrayList<LegendeLabyrinthe>> grid = new ArrayList<>();
        try {
            File level = new File("C:\\Users\\leogi\\Desktop\\PACMAN_PTUT\\Pacman\\src\\sample\\level1");
            Scanner l = new Scanner(level);
            while (l.hasNextLine()) {
                String data = l.nextLine();
                grid.add(new ArrayList<>());
                for(int c = 0; c < data.length(); c++) {
                    grid.get(grid.size()-1).add(LegendeLabyrinthe.intToLegendeLabyrinthe(Integer.parseInt(data.charAt(c) + "")));
                }
            }
            l.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}