public class Radio {

    private int increaseRadioStation;
    private int nextRadioStation;
    private int prevRadioStation;
    private int currentRadioStation;
    private int currentVolume;
    private int increaseVolume;
    private int decreaseVolume;

    public int getIncreaseRadioStation() {
        return increaseRadioStation;
    }

    public int getNextRadioStation() {
        return nextRadioStation;
    }

    public int getPrevRadioStation() {
        return prevRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setIncreaseRadioStation(int newIncreaseRadioStation) {
        if (newIncreaseRadioStation < 0) {
            return;
        }
        if (newIncreaseRadioStation > 9) {
            return;
        }
        this.increaseRadioStation = newIncreaseRadioStation + 1;
    }

    public void setNextRadioStation(int newNextRadioStation) {
        if (newNextRadioStation <= 9) {
        }
        this.nextRadioStation = 0;
    }

    public void setPrevRadioStation(int newPrevRadioStation) {
        if (currentRadioStation <= 0) {
        }
        this.prevRadioStation = 9;
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


    public void setIncreaseVolume(int newIncreaseVolume) {
        if (increaseVolume < 10) {
        }
        this.increaseVolume = increaseVolume + 1;
    }

    public void setDecreaseVolume(int NewDecreaseVolume) {
        if (decreaseVolume > 0) {
        }
        decreaseVolume = (decreaseVolume - 1);
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