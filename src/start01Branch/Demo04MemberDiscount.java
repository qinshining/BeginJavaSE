package start01Branch;

import java.util.Scanner;

public class Demo04MemberDiscount {
    public static void main(String[] args) {
        System.out.println("Please input score:");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        double discount = GetDiscount(score);
        System.out.println("Now the discount is:" + discount);
    }

    private static double GetDiscount(int score) {
        double discount = 1;
        if (score > 0 && score < 2000) {
            discount = 0.9;
        } else if (score >= 2000 && score < 4000) {
            discount = 0.8;
        } else if (score >= 4000 && score < 8000) {
            discount = 0.7;
        } else if (score >= 8000) {
            discount = 0.6;
        }
        return discount;
    }
}
