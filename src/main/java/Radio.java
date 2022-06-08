public class Radio {


    private int maxRadioStation;

    private int minRadioStation;
    private int currentRadioStation;
    private int currentVolume;

    private int amountRadioStations;


    public Radio(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;
    }

    public Radio(){
        amountRadioStations = 10;
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
        if (currentRadioStation > 9) {
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
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = 0;
        } else {
            int nextRadioStation = currentRadioStation + 1;
            this.currentRadioStation = nextRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = maxRadioStation;
        } else {
            int nextRadioStation = currentRadioStation - 1;
            this.currentRadioStation = nextRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            int increaseVolume = currentVolume + 1;
            this.currentVolume = increaseVolume;
        } else {
            return;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            int decreaseVolume = currentVolume - 1;
            this.currentVolume = decreaseVolume;
        } else {
            return;
        }
    }
}
