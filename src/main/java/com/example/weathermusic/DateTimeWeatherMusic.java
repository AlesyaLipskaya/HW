package com.example.weathermusic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeWeatherMusic {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Текущая дата и время: " + formattedDate);

        try {
            // Получение прогноза погоды
            String weatherForecast = WeatherAPI.getWeatherForecast();
            System.out.println("Прогноз погоды: " + weatherForecast);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Воспроизведение случайной песни
        MusicPlayer.playRandomSong();
    }
}
