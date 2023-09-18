package com.example.weathermusic;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Random;

public class MusicPlayer {
    private static final String MUSIC_FOLDER_PATH = "path/to/good/music/folder";

    public static void playRandomSong() {
        File musicFolder = new File(MUSIC_FOLDER_PATH);
        File[] musicFiles = musicFolder.listFiles();

        if (musicFiles != null && musicFiles.length > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(musicFiles.length);
            File randomFile = musicFiles[randomIndex];

            try {
                InputStream inputStream = new BufferedInputStream(new FileInputStream(randomFile));
                Player player = new Player(inputStream);
                player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
