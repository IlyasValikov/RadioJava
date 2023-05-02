package ru.netology.javailya.RadioJava;
public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        } else newCurrentStation = newCurrentStation;
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        } else newCurrentStation = newCurrentStation;

        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void setMaxStation() {
        currentStation = 9;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        } currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
