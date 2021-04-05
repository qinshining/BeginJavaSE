package start05OOP;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        test(new Fly() {
            @Override
            public boolean canFly() {
                return false;
            }

            @Override
            public void doFly() {

            }
        });
    }

    public static void test(Fly fly){

    }
}

interface Fly {
    boolean canFly();
    void doFly();
}