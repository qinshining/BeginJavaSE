package start01Branch;

import java.util.Scanner;

public class Demo05QuickCall {
    public static void main(String[] args) {
        System.out.println("Xiaoming, please tell me what you want to do");
        Scanner scanner = new Scanner(System.in);
        String callOn =  scanner.nextLine();
        switch (callOn) {
            case "1":
                System.out.println("Call dad");
                break;
            case "2":
                System.out.println("Call mom");
                break;
            case "3":
                System.out.println("Call grandpa");
                break;
            default:
                System.out.println("Sorry I don't know.");
                break;
        }
    }
}
