package ru.netology.OOP.Radioman.services;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;

    public void nextNumberOfCurrentRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            if (currentRadioStation == 9) {
                currentRadioStation = 0;
            }
        }
    }

    public void prevNumberOfCurrentRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            if (currentRadioStation <= 0) {
                currentRadioStation = 9;
            }
        }
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume = currentRadioVolume + 1;
        }
        if (currentRadioVolume == 10) {
            currentRadioVolume = 10;
        }
    }

    public void decreaseRadioVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        }
        if (currentRadioVolume == 0) {
            currentRadioVolume = 0;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
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
}