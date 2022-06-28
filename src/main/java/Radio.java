public class Radio {


    private int maxRadioStation = 9;

    private int minRadioStation;
    private int currentRadioStation;
    private int currentVolume;

    private int amountRadioStations;

    public Radio() {
        amountRadioStations = 10;
    }

    public Radio(int amountRadioStations) {
        maxRadioStation = amountRadioStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountRadioStations() {
        return amountRadioStations;
    }

    public void setAmountRadioStations(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setMaxRadioStation(int amountRadioStations) {
        this.maxRadioStation = amountRadioStations - 1;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            return;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
        currentVolume--;
        } else {
            return;
        }
    }
}
