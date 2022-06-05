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
    void maxImpossibleStation() {
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        radio.setCurrentVolume(9);
        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextFullRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevFullRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevMinRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevMaxImpossibleRadioStation() {
        radio.setCurrentRadioStation(15);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void minCurrentRadioStation() {
        radio.setCurrentRadioStation(1);
        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minImpossibleCurrentRadioStation() {
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentRadioStation() {
        radio.setCurrentRadioStation(7);
        int actual = radio.getCurrentRadioStation();
        int expected = 7;

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
    void increaseImpossibleVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

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
    void decreaseImpossibleVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentMinVolume() {
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentMinPossibleVolume() {
        radio.setCurrentVolume(1);
        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentMaxVolume() {
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentMaxPossibleVolume() {
        radio.setCurrentVolume(10);
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}


