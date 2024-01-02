package PE3;
import java.util.Random;
public class SquareRoot {
    public static void main(String[] args) {
        Random rand = new Random();

        long bigRandNum = rand.nextLong(1000000000000000L, 1000000000000300L);

        System.out.println("The value is: " + bigRandNum);

        int count = 0;

        while (bigRandNum!= 1) {
            bigRandNum = (long) Math.sqrt(bigRandNum);
            count ++;
            System.out.println(bigRandNum);
        }

        System.out.println("Count: " + count);



    }
}
