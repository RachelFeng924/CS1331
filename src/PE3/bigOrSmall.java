package PE3;

public class bigOrSmall {
    public static void main(String[] args) {
        int smallRandNum = 5 - (int) (Math.random()*4);
        System.out.println("We will run " + smallRandNum + " times!");

        int n;
        for (int i = 0; i < smallRandNum; i++) {
            n = 20 - (int) (Math.random()*19);
            System.out.println("The value is: " + n);
            if (n > 10) {
                System.out.println("Yay!");
            }
            else {
                System.out.println("Nay!");
            }
        }
    }
}
