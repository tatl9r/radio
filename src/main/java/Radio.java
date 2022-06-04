public class Radio {


    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9){
            this.currentRadioStation = 0;
        } else {
            int nextRadioStation = currentRadioStation + 1;
            this.currentRadioStation = nextRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        } else {
            int nextRadioStation = currentRadioStation - 1;
            this.currentRadioStation = nextRadioStation;
        }
    }

    public void increaseVolume() {
          int increaseVolume = currentVolume + 1;
            this.currentVolume = increaseVolume;
        }


    public void decreaseVolume() {
          int decreaseVolume = currentVolume - 1;
            this.currentVolume = decreaseVolume;
        }
    }