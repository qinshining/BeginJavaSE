package start01Branch;

import java.util.Scanner;

public class Demo02LuckyMember {
    public static void main(String[] args) {
        System.out.println("Welcome to lottery system.");
        System.out.println("Please input your number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int luckyNumber = (int) (Math.random() * 100);
        if (number == luckyNumber) {
            System.out.println("you are a lucky dog!");
        } else {
            System.out.println("Thanks for participating:" + luckyNumber);
        }
    }
}
