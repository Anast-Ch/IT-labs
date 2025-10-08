package lab2;


public class Headphones extends CompPeripherals {
    private int curVolume;
    
    private static int objectCounter = 0;

    public Headphones(String connectionType, int curVolume, boolean isDualMode) {
        super(connectionType, isDualMode);
        this.curVolume = curVolume;
        objectCounter++;
    }

    public Headphones() {
        this("Bluetooth", 50, false);
    }

    public static int getObjectCounter() {
        return objectCounter;
    }

    @Override
    public String getInfo() {
        return "Наушники: " +
               getConnectionSupport() +
               "; текущая громкость: " + curVolume + "%";
    }

    public int changeVolume(boolean increase) {
        int step = 10;
        int maxVolume = 100;

        if (increase) {
            int newVol = this.curVolume + step;
            if (newVol >= maxVolume){
                newVol = maxVolume;
            }
            this.curVolume = newVol;
            return curVolume;
        }
        else {
            int newVol = this.curVolume - step;
            if (newVol <= 0) {
                newVol = 0;
            } 
            this.curVolume = newVol;
            return curVolume;
        }
    }

    public double getCurVol() {
        return this.curVolume;
    }

    public void setCurVol(int val) {
        if (val < 0) {
            System.out.println("Ошибка. Громкость не может быть отрицательной.");
        } else if (val > 100) {
            System.out.println("Ошибка. Превышена максимально возможная громкость (100%).");
        } else {
            this.curVolume = val;
        }
    }
}
