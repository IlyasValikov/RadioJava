package ru.netology.javailya.RadioJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
     @Test
    public void test() {
     Radio rad = new Radio(3);

     Assertions.assertEquals(0, rad.getMinStation());
     Assertions.assertEquals(3, rad.getMaxStation());
     Assertions.assertEquals(0, rad.getCurrentStation());
     Assertions.assertEquals(0, rad.getMinVolume());
     Assertions.assertEquals(3, rad.getMaxVolume());
     Assertions.assertEquals(0, rad.getCurrentVolume());

     }

     @Test
     public void shouldSetNextStationAboveMax() {
         Radio rad = new Radio(8);

         rad.setCurrentStation(7);

         int expected = 7;
         int actual = rad.getCurrentStation();

         Assertions.assertEquals(expected, actual);
     }

    @Test
    public void shouldNotSetNextStationAboveMax() {
        Radio rad = new Radio(6);

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMin() {
        Radio rad = new Radio(9);

        rad.setCurrentStation(-2);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStation() {
        Radio rad = new Radio(9);
        rad.setCurrentStation(9);

        rad.setNextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio(100);
        rad.setCurrentVolume(57);

        rad.increaseVolume();

        int expected = 58;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio(100);
        rad.setCurrentVolume(45);

        rad.decreaseVolume();

        int expected = 44;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseAboveMinLimit() {
        Radio rad = new Radio(100);
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAboveMax() {
        Radio rad = new Radio(100);

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}