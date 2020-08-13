package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldGetRadiostationNumberMax() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);

        assertEquals(20, radio.getRadiostationNumberMax());
    }

    @Test
    public void shouldGetCurrentRadiostation() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);

        assertEquals(10, radio.getCurrentRadiostationNumber());
    }

    @Test
    public void shouldGetVolumeMax() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        assertEquals(100, radio.getVolumeMax());
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextRadiostation1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
                radio.nextRadiostation();

        assertEquals(11, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation2() {
        Radio radio = new Radio(
                20,
                20,
                50,
                true);

        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation3() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostationNumber(22);
        radio.nextRadiostation();

        assertEquals(20, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation4() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostationNumber(-1);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }


    @Test
    public void shouldPrevRadiostation1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation2() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostationNumber(0);
        radio.prevRadiostation();

        assertEquals(20, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation3() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostationNumber(23);
        radio.prevRadiostation();

        assertEquals(20, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation4() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostationNumber(-2);
        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldVolumeUp1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.volumeUp();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentVolume(102);
        radio.volumeUp();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentVolume(-2);
        radio.volumeUp();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.volumeDown();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown2() {
        Radio radio = new Radio(
                20,
                10,
                150,
                true);
        radio.volumeDown();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown3() {
        Radio radio = new Radio(
                20,
                10,
                -5,
                true);
        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

}