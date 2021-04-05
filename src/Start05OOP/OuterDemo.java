package Start05OOP;

public class OuterDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();//This is different form C#, because inner class has outer reference
    }
}

class Outer {
    private int age;

    class Inner {
        public void test() {
            System.out.println(age);
        }
    }
}
