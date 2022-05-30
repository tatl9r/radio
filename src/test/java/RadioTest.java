import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void findMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseMaxStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(9);
        int actual = radio.getNextRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(0);
        int actual = radio.getPrevRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStation() {
        Radio radio = new Radio();
        radio.setIncreaseRadioStation(5);
        int actual = radio.getIncreaseRadioStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseMinRadioStation() {
        Radio radio = new Radio();
        radio.setIncreaseRadioStation(-1);
        int actual = radio.getIncreaseRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseMaxRadioStation() {
        Radio radio = new Radio();
        radio.setIncreaseRadioStation(10);
        int actual = radio.getIncreaseRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(0);
        int actual = radio.getIncreaseVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(1);
        int actual = radio.getDecreaseVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}


