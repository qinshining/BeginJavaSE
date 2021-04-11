package start06CommonClass;

public class BasicDataDemo {
    public static void main(String[] args) {
        int i1 = 10;
        Integer integer1 = 10;//Integer.valueOf(10);
        int i2 = integer1.intValue();
        int i3 = integer1;
        System.out.println(i1 == integer1); //true, auto boxing and unboxing

        Integer integer2 = 10;
        Integer integer3 = 10;
        System.out.println(integer2 == integer3); //true, cache -128~127
        Integer integer4 = 128;
        Integer integer5 = 128;
        System.out.println(integer4 == integer5); //false
    }
}
