public class Radio {


    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getPrevRadioStation() {
        return currentRadioStation;
    }
    public int getNextRadioStation() {
        return currentRadioStation;
    }
    public int getIncreaseVolume() {
        return currentVolume;
    }
    public int getDecreaseVolume() {
        return currentVolume;
    }

    public void setNextRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation == 9){
            return;
        }
        this.currentRadioStation = newCurrentRadioStation + 1;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }
    public void setPrevRadioStation(int newCurrentRadioStation) {
        if (currentRadioStation == 0){
            newCurrentRadioStation = 9;
        }
        this.currentRadioStation = newCurrentRadioStation - 1;
    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
        }
        this.currentVolume = newCurrentVolume + 1;
    }
    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
        }
        this.currentVolume = newCurrentVolume - 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }
}