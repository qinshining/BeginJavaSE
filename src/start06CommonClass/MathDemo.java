package start06CommonClass;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(2 - 10));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.14));

        Random random = new Random();
        System.out.println(random.nextFloat());//[0.0, 1.0)
    }
}