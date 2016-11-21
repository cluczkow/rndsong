package com.luczkow;

/**
 * Created by chris luczkow on 11/13/2016.
 */
public class Song {

    private String artist;
    private String title;
    private long weight;

    public Song(String artist, String title, long weight) {

        this.artist = artist;
        this.title = title;
        this.weight = weight;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public long getWeight() {
        return weight;
    }
}
