package PE5;

public class GTSandwich {
    //VARIABLES
    private String bread;
    private String meat;
    private String[] extras;
    private int numMeat;
    private double price;
    private boolean hasSauce;
    private boolean makeCombo;

    //CONSTRUCTORS

    public GTSandwich(String b, String m, String[] e, int n, double p, boolean s, boolean c) {
        bread = b;
        meat = m;
        extras = e;
        numMeat = n;
        price = p;
        hasSauce = s;
        makeCombo = c;
    }
    public GTSandwich() {
        this("Rye", "Turkey", new String[] {}, 4, 8.75, true, true);
    }

    public GTSandwich(String b, String m, boolean c) {
        this(b, m, new String[] {}, 4, 8.75, true, c);
    }

    //GETTERS
    public String getBread() {
        return bread;
    }
    public String getMeat() {
        return meat;
    }
    public String[] getExtras() {
        return extras;
    }
    public int getNumMeat() {
        return numMeat;
    }
    public double getPrice() {
        return (Math.round(price*100)/100.00);
    }
    public boolean getHasSauce() {
        return hasSauce;
    }
    public boolean getMakeCombo() {
        return makeCombo;
    }

    //SETTERS
    public void setBread (String b) {
        bread = b;
    }
    public void setMeat(String m) {
        meat = m;
    }
    public void setExtras(String[] e) {
        extras = e;
    }
    public void setNumMeat(int n) {
        numMeat = n;
    }
    public void setPrice(double p) {
        price = p;
    }
    public void setHasSauce(boolean s) {
        hasSauce = s;
    }
    public void setMakeCombo(boolean c) {
        if (c && !this.getMakeCombo()){
            price += 2.00;
        }

        if (!c && this.getMakeCombo()) {
            price -= 2.00;
        }

        makeCombo = c;
    }
    public void applyCoupon(String code) {
        if (code.equals("CS1331") && this.getMakeCombo()) {
            this.setPrice(this.getPrice()*0.5);
            this.setNumMeat(this.getNumMeat()*2);
            System.out.println("Coupon Applied");
        }
    }
    public void applyCoupon() {
        if (this.getPrice() >= 20.00) {
            this.setPrice(this.getPrice() - 5.00);
            if (!this.getMakeCombo()) {
                this.setMakeCombo(true);
            }
            System.out.println("Discount Applied");
        }

        else {
            System.out.println("Discount Not Applied");
        }
    }
    public void printExtras() {
        if (this.getExtras().length == 0) {
            System.out.println("The customer wants no extras");
        }
        else {
            System.out.print("The customer wants these extras: ");
            for (int i = 0; i < this.getExtras().length - 1; i++) {
                System.out.print(this.getExtras()[i] + ", " );
            }
            System.out.println(this.getExtras()[this.getExtras().length - 1]);
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder(("Gt Sandwich that costs " + this.getPrice() + " with " + this.getBread() + ", " + this.getMeat() + ", "));

        if (this.getExtras().length != 0){
            for (int i = 0; i < this.getExtras().length; i++) {
                s.append(this.getExtras()[i]).append(", ");
            }
        }

        s.append(this.getNumMeat()).append(" slices of meat, Sauce: ").append(this.getHasSauce()).append(", Combo: ").append(this.getMakeCombo());

        return (s.toString());
    }

    public static void main(String[] args) {
        GTSandwich houseSpecial = new GTSandwich("French", "Turkey", new String[]{"Banana Peppers","Spinach", "Chipotle Mayo"}, 4, 10.75, true, true);
        GTSandwich javaSandwich = new GTSandwich();
        houseSpecial.applyCoupon("CS1331");
        javaSandwich.applyCoupon();
        houseSpecial.printExtras();
        System.out.println(houseSpecial);
        System.out.println(javaSandwich);

    }
}
