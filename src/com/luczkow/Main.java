package com.luczkow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Songs songs = new Songs(args[0]);
            Amps amps = new Amps(args[1]);

            Scanner keyboard = new Scanner(System.in);
            while (keyboard.nextLine() != null) {

                Song rndSong = songs.rnd();
                String rndAmp = amps.rnd();

                if (rndSong != null && rndAmp != null) {
                    System.out.println(rndSong.getArtist() + " - " + rndSong.getTitle() + " - " + rndSong.getWeight());
                    System.out.println(rndAmp);
                }
                else {
                    System.out.println("wtf");
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
