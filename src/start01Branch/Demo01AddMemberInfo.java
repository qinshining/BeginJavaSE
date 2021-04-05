package start01Branch;

import java.util.Scanner;

public class Demo01AddMemberInfo {
    public static void main(String[] args) {
        System.out.println("Welcome to my member system");
        System.out.println("Add member...");
        System.out.println("please input member number(4 number):");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("please input member birthday (month/day<use two integer to show>:");
        String birthday = scanner.nextLine();
        System.out.println("please input score:");
        String score = scanner.nextLine();

        if (number.length() != 4) {
            System.out.println("member number is invalid:" + number);
        } else {
            System.out.println("add success:" + number + "\t" + birthday + "\t" + score);
        }
    }
}
