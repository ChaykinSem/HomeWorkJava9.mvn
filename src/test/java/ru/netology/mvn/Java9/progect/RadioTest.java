package ru.netology.mvn.Java9.progect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/set.cvs")
    public void shouldSetRadionumber(int expected, int radioNumber) {
        Radio radio = new Radio();
        radio.setRadioNumber(radioNumber);

        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumber() {
        Radio radio = new Radio();
        radio.setToMaxNumber();

        int expected = 9;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/next.cvs")
    public void shouldNextRadioNumber(int expected, int newRadioNumber) {
        Radio radio = new Radio();
        radio.setRadioNumber(newRadioNumber);
        radio.nextRadioNumber();

        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prev.cvs")
    public void shouldPrevRadioNumber(int expected, int newRadioNumber) {
        Radio radio = new Radio();
        radio.setRadioNumber(newRadioNumber);
        radio.prevRadioNumber();

        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/set_sound.cvs")
    public void shouldSetSoundVolume(int expected, int newSoundVolume) {
        Radio radio = new Radio();
        radio.setSoundVolume(newSoundVolume);

        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();
        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/next_sound.cvs")
    public void shouldNextSoundVolume(int expected, int newSoundVolume) {
        Radio radio = new Radio();
        radio.setSoundVolume(newSoundVolume);
        radio.nextSoundVolume();

        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest //Проверка уменьшения звука
    @CsvFileSource(files = "src/test/resources/prev_sound.cvs")
    public void shouldPrevSoundVolume(int expected, int newSoundVolume) {
        Radio radio = new Radio();
        radio.setSoundVolume(newSoundVolume);
        radio.prevSoundVolume();

        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
