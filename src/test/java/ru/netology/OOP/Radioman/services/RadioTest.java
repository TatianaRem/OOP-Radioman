package ru.netology.OOP.Radioman.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationInBorders() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(6);

        rad.nextNumberOfCurrentRadioStation();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationAboveBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.nextNumberOfCurrentRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationFromStartOfBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.nextNumberOfCurrentRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousNumberOfRadioStationInBorders() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        rad.prevNumberOfCurrentRadioStation();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousNumberOfRadioStationAboveBorders() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.prevNumberOfCurrentRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousNumberOfRadioStationUnderBorders() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.prevNumberOfCurrentRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolumeAboveBorders() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(10);

        rad.increaseRadioVolume();

        int expected = 10;
        int actual = rad.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolumeFromStartOfBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);

        rad.increaseRadioVolume();

        int expected = 1;
        int actual = rad.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolumeInTheMiddleOfBorders() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(4);

        rad.increaseRadioVolume();

        int expected = 5;
        int actual = rad.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioVolumeInTheEndOfBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(10);

        rad.decreaseRadioVolume();

        int expected = 9;
        int actual = rad.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioVolumeAtTheStartOfBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);

        rad.decreaseRadioVolume();

        int expected = 0;
        int actual = rad.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioVolumeInTheMiddleOfBorder() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(5);

        rad.decreaseRadioVolume();

        int expected = 4;
        int actual = rad.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

}
