package sample;

import  java.io.*;
import javax.sound.sampled.*;

public class Audio extends Thread{
    private AudioInputStream audioInputStream = null;
    public void run(){
        while(true) {
            File fichier = new File("src/assets/son/sonMenu.wav");
            try { AudioSystem.getAudioFileFormat(fichier);
            } catch (UnsupportedAudioFileException | IOException e1) {
                e1.printStackTrace();}
            try { audioInputStream = AudioSystem.getAudioInputStream(fichier);
            } catch (UnsupportedAudioFileException | IOException e) {
                e.printStackTrace(); }
            AudioFormat audioFormat = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
            SourceDataLine line;
            try { line = (SourceDataLine) AudioSystem.getLine(info);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
                return; }
            try { line.open(audioFormat);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
                return;}
            line.start();
            try {
                byte[] bytes = new byte[1024];
                int bytesRead;
                while ((bytesRead = audioInputStream.read(bytes, 0, bytes.length)) != -1) {
                    line.write(bytes, 0, bytesRead);
                    //while (Option.musique) {int y=0;}
                    System.out.println("toto");
                }
            } catch (IOException io) {
                io.printStackTrace();
                return;
            }}}}