package HW1;

public class Car {
    private String type;
    private int mileage;
    private int nextOilChange;
    private double[] tireLife;
    private static int numCars = 0;

    public Car(String t, int m, int n, double[] tL) {
        numCars++;
        type = t;

        if (m < 0) {
            m = 0;
        }
        mileage = m;

        if (n < 0) {
            n = m + 3000;
        }
        nextOilChange = n;
        tireLife = tL;
        for (int i = 0; i < tL.length; i++) {
            if (!(tL[i]>= 0 && tL[i] <= 1.0)) {
                tL[i] = 1.0;
            }
        }
    }

    public Car(String t, int m, double[] tL) {
        this(t, m, m+3000, tL);
        numCars++;
    }

    public Car(String t, double[] tL) {
        this(t, 0, 3000, tL);
        numCars++;
    }

    public Car(Car initCar) {
        type = initCar.type;
        mileage = initCar.mileage;
        nextOilChange = initCar.nextOilChange;
        for (int i = 0; i < initCar.tireLife.length; i++) {
            tireLife[i] = initCar.tireLife[i];
        }
    }

    private int averageTireLife() {
        int s = 0;

        for (int i = 0; i < 4; i++) {
            s += tireLife[i];
        }

        s = (int) (s/4)*100;

        return s;
    }

    public String toString() {
        return ("This is a car of type " + type + " with a mileage of " + mileage + " miles. I'm due for a checkup in " + nextOilChange + " miles, and my average tire life is " + averageTireLife() + "%.");

    }

    //GETTERS
    public int getNextOilChange() {
        return nextOilChange;
    }

    public int getMileage() {
        return mileage;
    }

    public double[] getTireLife() {
        return tireLife;
    }
    //SETTERS
    public void setNextOilChange(int m) {
        nextOilChange = m;
    }



}
