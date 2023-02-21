package ru.netology.OOP.Radioman.services;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int minRadioVolume = 0;
    private int maxRadioVolume = 100;
    private int currentRadioStation;
    private int currentRadioVolume;

    public Radio() {

    }

    public Radio( int desiredNumberOfRadioStations) {
    maxRadioStation = minRadioStation + desiredNumberOfRadioStations;
    }

    public void nextNumberOfCurrentRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevNumberOfCurrentRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < maxRadioVolume) {
            currentRadioVolume = currentRadioVolume + 1;
        }
        if (currentRadioVolume == maxRadioVolume) {
            currentRadioVolume = maxRadioVolume;
        }
    }

    public void decreaseRadioVolume() {
        if (currentRadioVolume > minRadioVolume) {
            currentRadioVolume = currentRadioVolume - 1;
        }
        if (currentRadioVolume == minRadioVolume) {
            currentRadioVolume = minRadioVolume;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {

        currentRadioVolume = newCurrentRadioVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioVolume() {
        return maxRadioVolume;
    }

    public int getMinRadioVolume() {
        return minRadioVolume;
    }
}