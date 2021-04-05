package start01Branch;

import java.util.Scanner;

public class Demo03BuyCar {
    public static void main(String[] args) {
        System.out.println("How much do you have?");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        if (money > 5000000) {
            System.out.println("kaidilake");
        } else if (money > 1000000) {
            System.out.println("pasate");
        } else if (money > 500000) {
            System.out.println("yilante");
        } else if (money > 100000) {
            System.out.println("aotuo");
        } else {
            System.out.println("jieanda");
        }
    }
}
