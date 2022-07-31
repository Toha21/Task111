import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextLastStationTest1() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);


        int actual = radio.getCurrentStation();
        int expected = 19;
        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void nextLastStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextExceedsStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevToLastTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void negativeStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void noExceedsVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void negativeVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void exceedsVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

}

