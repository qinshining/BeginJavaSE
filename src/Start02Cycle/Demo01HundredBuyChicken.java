package Start02Cycle;

public class Demo01HundredBuyChicken {
    public static void main(String[] args) {
        final int smallPrice = 1;
        final int middlePrice = 3;
        final int bigPrice = 5;

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                for (int z = 0; z <= 100; z++) {
                    if ((x * smallPrice
                            + y * middlePrice
                            + z * bigPrice) == 100) {
                        System.out.println("small:" + x + "\t" + "middle:" + y + "\t" + "big:" + z);
                    }
                }
            }
        }
    }
}
