package HW1;

public class ShopDriver {
    public static void main(String[] args) {
        Car c1 = new Car("SUV", 15000, 14600, new double[] {0.70, 0.32, 0.45, 0.50});

        Mechanic m1 = new Mechanic("Raul");

        m1.service(c1);

        System.out.println(m1);
        System.out.println(c1);

        //checks if variables violating constraints are reset to default values
        Car c2 = new Car("Tesla", -500, -124, new double[] {1.00, 1.50, 1.00, 1.50});
        System.out.println(c2);
    }

}
