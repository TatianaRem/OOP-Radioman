package ru.netology.OOP.Radioman.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void testForSettingNewNumberOfRadioStations() {
        Radio rad = new Radio(16);

        Assertions.assertEquals(16, rad.getMaxRadioStation());
    }

    @Test
    public void testForSettingNewNumberOfRadioStationsAndTurnToTheNext() {
        Radio rad = new Radio(16);
        rad.setCurrentRadioStation(16);

        rad.nextNumberOfCurrentRadioStation();

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {

        rad.setCurrentRadioStation(5);

        Assertions.assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {

        rad.setCurrentRadioStation(10);

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetToMaxRadioStation() {

        rad.setCurrentRadioStation(9);

        Assertions.assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetToMinRadioStation() {

        rad.setCurrentRadioStation(0);

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderMin() {

        rad.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationInBorders() {

        rad.setCurrentRadioStation(8);

        rad.nextNumberOfCurrentRadioStation();

        Assertions.assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationAboveBorder() {

        rad.setCurrentRadioStation(9);

        rad.nextNumberOfCurrentRadioStation();

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationFromStartOfBorder() {

        rad.setCurrentRadioStation(0);

        rad.nextNumberOfCurrentRadioStation();

        Assertions.assertEquals(1, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationFromTheStartOfBorder2() {

        rad.setCurrentRadioStation(1);

        rad.nextNumberOfCurrentRadioStation();

        Assertions.assertEquals(2, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToThePreviousNumberOfRadioStationInBorders() {

        rad.setCurrentRadioStation(1);

        rad.prevNumberOfCurrentRadioStation();

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToThePreviousNumberOfRadioStationAboveBorders() {

        rad.setCurrentRadioStation(9);

        rad.prevNumberOfCurrentRadioStation();

        Assertions.assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToThePreviousNumberOfRadioStationUnderBorders() {

        rad.setCurrentRadioStation(0);

        rad.prevNumberOfCurrentRadioStation();

        Assertions.assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextNumberOfRadioStationAtTheEndBorders() {

        rad.setCurrentRadioStation(9);

        rad.nextNumberOfCurrentRadioStation();

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadioVolumeAboveBorders() {

        rad.setCurrentRadioVolume(100);

        rad.increaseRadioVolume();

        Assertions.assertEquals(100, rad.getCurrentRadioVolume());
    }

    @Test
    public void shouldIncreaseRadioVolumeFromStartOfBorder() {

        rad.setCurrentRadioVolume(0);

        rad.increaseRadioVolume();

        Assertions.assertEquals(1, rad.getCurrentRadioVolume());
    }

    @Test
    public void shouldIncreaseRadioVolumeInTheEndOfBorders() {

        rad.setCurrentRadioVolume(99);

        rad.increaseRadioVolume();

        Assertions.assertEquals(100, rad.getCurrentRadioVolume());
    }

    @Test
    public void shouldDecreaseRadioVolumeInTheEndOfBorder() {

        rad.setCurrentRadioVolume(100);

        rad.decreaseRadioVolume();

        Assertions.assertEquals(99, rad.getCurrentRadioVolume());
    }

    @Test
    public void shouldDecreaseRadioVolumeAtTheStartOfBorder() {

        rad.setCurrentRadioVolume(0);

        rad.decreaseRadioVolume();

        Assertions.assertEquals(0, rad.getCurrentRadioVolume());
    }

    @Test
    public void shouldDecreaseRadioVolumeInTheMiddleOfBorder() {

        rad.setCurrentRadioVolume(55);

        rad.decreaseRadioVolume();

        Assertions.assertEquals(54, rad.getCurrentRadioVolume());
    }

}
