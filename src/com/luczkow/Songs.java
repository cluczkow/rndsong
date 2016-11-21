package com.luczkow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by chris luczkow on 11/20/2016.
 */
class Songs {

    private List<Song> songs;
    private int weight;

    Songs(String file) throws Exception {

        songs = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split("\\|");
            int w = Integer.parseInt(fields[2]);
            songs.add(new Song(fields[0], fields[1], w));
            weight += w;
        }
    }

    Song rnd() throws Exception {

        Song rndSong = null;

        if (songs.size() > 0) {
            Random random = new Random();
            int rnd = random.nextInt(weight);
            int n = 0;

            for (Song song : songs) {
                n += song.getWeight();
                if (rnd < n) {
                    rndSong = song;
                    break;
                }
            }

            if (rndSong != null) {
                weight -= rndSong.getWeight();
            }
        }

        return rndSong;
    }
}
