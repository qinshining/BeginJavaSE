package start02Cycle;

import java.util.Scanner;

public class Demo00TenToTwo {
    public static void main(String[] args) {
        System.out.println("please input a number to binary said");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int binaryNumber = number % 2;
            result.insert(0, binaryNumber);
            number /= 2;
        }
        System.out.println("result is:" + result);
    }
}
