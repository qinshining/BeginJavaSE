package start02Cycle;

public class Demo01HundredBuyChicken {
    public static void main(String[] args) {
        final double smallPrice = 1.0 / 3;
        final double middlePrice = 3;
        final double bigPrice = 5;

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    if ((x + y + z) == 100
                            && x % 3 == 0
                            && (x * smallPrice + y * middlePrice + z * bigPrice) == 100) {
                        System.out.println("small:" + x + "\t" + "middle:" + y + "\t" + "big:" + z);
                    }
                }
            }
        }
    }
}
