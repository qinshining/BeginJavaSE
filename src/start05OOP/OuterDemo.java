package start05OOP;

public class OuterDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();//This is different form C#, because inner class has outer reference
        Outer outer = new Outer();
        Outer.Inner inner2 = outer.new Inner();
        inner2.test();

        Outer.StaticInner staticInner = new Outer.StaticInner();
    }
}

class Outer {
    private int age;

    public void test() {
        var inner = new Inner();
        System.out.println(inner.innerAge);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    class Inner {
        private int innerAge;

        public void setInnerAge(int innerAge) {
            this.innerAge = innerAge;
        }

        public void test() {
            System.out.println(age);
            System.out.println(Outer.this.age);
        }
    }

    static class StaticInner {

    }
}
