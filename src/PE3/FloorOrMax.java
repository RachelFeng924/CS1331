package PE3;

public class FloorOrMax {
    public static void main(String[] args) {
        double myRand = Math.random()*50 + 4;
        System.out.printf("The value is %.2f", myRand);
        System.out.println();

        //if greater than 15 and even, print floor int
        if (Math.floor(myRand) > 15 && Math.floor(myRand)%2 == 0) {
            System.out.println((int)Math.floor(myRand));
        }

        //if floor is odd, print out max of myRand and 32
        if (Math.floor(myRand) % 2 == 1) {
              System.out.println(Math.max((int)myRand, 32));
        }

        //else, print as is
        else {
            System.out.println(myRand);
        }
    }
}
