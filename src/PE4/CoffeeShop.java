package PE4;
import static PE4.Order.*;
import java.util.Scanner;
public class CoffeeShop {

    public static Order[] createOrderArray(String orders) {
        char[] orderList = orders.toCharArray();
        Order[] enumList = new Order[orders.length()];

        for (int i = 0; i < orderList.length; i++){
            if (orderList[i] == 'L') {
                enumList[i] = LATTE;
            }

            else if (orderList[i] == 'C') {
                enumList[i] = COFFEE;
            }

            else if (orderList[i] == 'I') {
                enumList[i] = ICED_COFFEE;
            }

            else if (orderList[i] == 'F') {
                enumList[i] = FRAPPE;
            }

            else if (orderList[i] == 'P') {
                enumList[i] = PASTRY;
            }
        }
        return enumList;
    }

    public static double lookupMakeTime(Order order) {
        double time = 0.0;
        switch (order) {
            case LATTE:
                time = 3.0;
                break;
            case COFFEE:
                time = 0.5;
                break;
            case ICED_COFFEE:
                time = 2.0;
                break;
            case FRAPPE:
                time = 6.0;
                break;
            case PASTRY:
                time = 3.0;
                break;
        }
        return time;
    }

    public static void computeOrderMakeTime(Order[] orders, int numBaristas) {
        double totalTime = 0.0;
        for (Order order : orders) {
            totalTime += lookupMakeTime(order);
        }

        double finalTime = (totalTime/numBaristas) + (orders.length % numBaristas);

        System.out.printf("It will take %.1f minutes for " + numBaristas + " to make these orders. \n", finalTime);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your local coffee shop! What does the rush look like today");
        Scanner scanner = new Scanner(System.in);
        String orderString = scanner.nextLine();

        Order[] orders = createOrderArray(orderString);

        computeOrderMakeTime(orders, 1);
        computeOrderMakeTime(orders, 2);
        computeOrderMakeTime(orders, 3);

    }
}
