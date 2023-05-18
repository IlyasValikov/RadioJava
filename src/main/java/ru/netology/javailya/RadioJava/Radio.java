package ru.netology.javailya.RadioJava;

public class Radio {
   private int sizeStation = 10;
    private int maxStation = sizeStation - 1;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {

    }

    public Radio(int sizeStation) {

        this.sizeStation = sizeStation;
    }


    public int getCurrentStation() {

        return currentStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = 0;
        } else {
            newCurrentStation = newCurrentStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = 9;
        } else {
            newCurrentStation = newCurrentStation;
        }

        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void setPrevStation() {
        int step = currentStation - 1;
        setCurrentStation(step);
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = 100;
        } else {
            newCurrentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = 0;
        } else {
            newCurrentVolume = newCurrentVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int score = currentVolume + 1;
        setCurrentVolume(score);
    }

    public void decreaseVolume() {
        int set = currentVolume - 1;
        setCurrentVolume(set);
    }
}
