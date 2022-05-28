public class Radio {


    private int increaseRadioStation;
    public void setIncreaseRadioStation(int newIncreaseRadioStation) {
        if (newIncreaseRadioStation < 0) {
            return;
        }
        if (newIncreaseRadioStation > 9) {
            return;
        }
        this.increaseRadioStation = newIncreaseRadioStation + 1;
    }
    public int getIncreaseRadioStation(){
        return increaseRadioStation;
    }
    private int nextRadioStation;
    public void setNextRadioStation(int newNextRadioStation) {
        if (newNextRadioStation <= 9) {
        } this.nextRadioStation = 0;
    }
    public int getNextRadioStation(){
        return nextRadioStation;
    }
    private int prevRadioStation;
    public void setPrevRadioStation(int newPrevRadioStation) {
        if (currentRadioStation <= 0) {
        } this.prevRadioStation = 9;
    }
    public int getPrevRadioStation(){
        return prevRadioStation;
    }
    private int currentRadioStation;
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0){
            return;
        }
        if (newCurrentRadioStation > 9){
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }
    public int getCurrentRadioStation(){
        return currentRadioStation;
    }


    private int currentVolume;
    public int getCurrentVolume(){
        return currentVolume;
    }
private int increaseVolume;
    public void setIncreaseVolume(int newIncreaseVolume) {
        if (increaseVolume < 10) {
            this.increaseVolume = increaseVolume + 1;
        }
    }
    public int getIncreaseVolume() {
        return increaseVolume;
    }
private int decreaseVolume;
    public void setDecreaseVolume(int NewDecreaseVolume) {
        if (decreaseVolume > 0) {
            decreaseVolume = (decreaseVolume - 1);
        }
    }
    public int getDecreaseVolume(){
        return decreaseVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 10){
            return;
        }
        this.currentVolume= newCurrentVolume;
    }
}