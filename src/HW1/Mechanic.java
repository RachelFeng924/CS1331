package HW1;

import static java.lang.String.format;

public class Mechanic {
    final String name;
    private double revenue;
    private double oilChangePrice;
    private double newTirePrice;

    public Mechanic(String n, double r, double o, double ntp) {
        name = n;

        if (r < 0.00) {
            r = 0.00;
        }

        if (o < 0.99) {
            o = 44.99;
        }

        if(ntp < 0.99) {
            ntp = 55.99;
        }

        revenue = r;
        oilChangePrice = o;
        newTirePrice = ntp;
    }

    public Mechanic(String n , double o, double ntp) {
        this(n, 0.00, 44.99, ntp);
    }

    public Mechanic(String n) {
        this(n, 0.00, 44.99, 55.99);
    }

    public String toString(){
        return format("This is a mechanic named " + name + ". I charge $%.2f for an oil change, and I charge $%.2f for a new tire. I've made $%.2f in revenue.", oilChangePrice, newTirePrice, revenue);
    }

    public void service(Car c) {
        if (c.getMileage() >= c.getNextOilChange()) {
            c.setNextOilChange(c.getMileage() + 3000);
            revenue += oilChangePrice;
        }

        for (int i = 0; i < 4; i++) {
            if (c.getTireLife()[i] <= 0.5) {
                revenue += newTirePrice;
                c.getTireLife()[i] = 1.00;
            }
        }
    }

}
