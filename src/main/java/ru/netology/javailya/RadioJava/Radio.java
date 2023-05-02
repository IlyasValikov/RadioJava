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

    public void setMaxStation() {
        currentStation = 9;
    }
}
