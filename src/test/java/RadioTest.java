import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void findMaxStation() {
        radio.setCurrentRadioStation(9);
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findOverMaxStation() {
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMinStation() {
        radio.setCurrentRadioStation(0);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findOverMinStation() {
        radio.setCurrentRadioStation(-2);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAmountStation() {
        Radio radio = new Radio(16);
        int actual = radio.getAmountRadioStations();
        int expected = 16;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDefaultAmountStation() {
        Radio radio = new Radio();
        int actual = radio.getAmountRadioStations();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAmountRadioStations() {
        radio.setAmountRadioStations(20);
        int actual = radio.getAmountRadioStations();
        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMaxRadioStations() {
        radio.setMaxRadioStation(15);
        int actual = radio.getMaxRadioStation();
        int expected = 14;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevMaxRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.setMaxRadioStation(10);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.setMaxRadioStation(10);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextMaxRadioStation() {
        radio.setCurrentRadioStation(15);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentVolume() {
        radio.setCurrentVolume(30);
        int actual = radio.getCurrentVolume();
        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCurrentMaxVolume() {
        radio.setCurrentVolume(150);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCurrentMinVolume() {
        radio.setCurrentVolume(-10);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseMaxVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void amountStations() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        int actual = radio.getCurrentRadioStation();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }
}