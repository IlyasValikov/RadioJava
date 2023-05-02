package ru.netology.javailya.RadioJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
     @Test
    public void shouldSetStation () {
         Radio cond = new Radio();

         cond.setCurrentStation(7);

         int expected = 7;
         int actual = cond.getCurrentStation();

         Assertions.assertEquals(expected, actual);
     }

     @Test
    public void shouldNotSetNextStationAboveMax() {
         Radio cond = new Radio();

         cond.setCurrentStation(10);

         int expected = 0;
         int actual = cond.getCurrentStation();

         Assertions.assertEquals(expected, actual);
     }

     @Test
    public  void shouldSetMaxStation() {
         Radio cond = new Radio();

         cond.setMaxStation();

         int expected = 9;
         int actual = cond.currentStation;

         Assertions.assertEquals(expected, actual);
     }

     @Test
    public void shouldNotSetStationAboveMin() {
         Radio cond = new Radio();

         cond.setCurrentStation(-2);

         int expected = 9;
         int actual = cond.getCurrentStation();

         Assertions.assertEquals(expected, actual);
     }
}
