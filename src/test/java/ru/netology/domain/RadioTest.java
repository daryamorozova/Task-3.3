package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    // Суть падающих тестов - чтобы можно было создать объект с количеством станций более 10 и дефолтным значением текущей радиостанции

    @Test
    public void shouldGetRadiostationNumberMax() {
        assertEquals(20, radio.getRadiostationNumberMax());
    }

    @Test
    public void shouldGetCurrentRadiostation() {
        assertEquals(10, radio.getCurrentRadiostationNumber());
    }
// Суть падающих тестов - чтобы можно было создать объект с максимальным уровнем громкости 100 и текущим значением по умолчанию 50

    @Test
    public void shouldGetVolumeMax() {
        assertEquals(100, radio.getVolumeMax());
    }

    @Test
    public void shouldGetCurrentVolume() {
        assertEquals(50, radio.getCurrentVolume());
    }
    //

    @Test
    public void shouldNextRadiostation1() {

        radio.setCurrentRadiostationNumber(5);
        radio.nextRadiostation();

        assertEquals(6, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation2() {
        radio.setCurrentRadiostationNumber(9);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation3() {
        radio.setCurrentRadiostationNumber(12);
        radio.nextRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation4() {
        radio.setCurrentRadiostationNumber(-1);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }


    @Test
    public void shouldPrevRadiostation1() {
        radio.setCurrentRadiostationNumber(5);
        radio.prevRadiostation();

        assertEquals(4, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation2() {
        radio.setCurrentRadiostationNumber(0);
        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation3() {
        radio.setCurrentRadiostationNumber(12);
        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation4() {
        radio.setCurrentRadiostationNumber(-2);
        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldVolumeUp1() {
        radio.setCurrentVolume(5);
        radio.volumeUp();

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        radio.setCurrentVolume(12);
        radio.volumeUp();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        radio.setCurrentVolume(-2);
        radio.volumeUp();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown1() {
        radio.setCurrentVolume(6);
        radio.volumeDown();

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown2() {
        radio.setCurrentVolume(12);
        radio.volumeDown();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown3() {
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

}