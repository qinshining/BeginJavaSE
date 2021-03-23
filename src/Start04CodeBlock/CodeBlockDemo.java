package Start04CodeBlock;

/**
 * code block:
 *      普通代码块
 *      构造代码块
 *      静态代码块
 *      同步代码块
 *
 */
public class CodeBlockDemo {
    private static final Object padlock = new Object();
    int a;

    static {
        System.out.println("static code block");
    }

    {
        System.out.println("construct block");
        System.out.println(a);// a is zero
    }

    public CodeBlockDemo() {
        System.out.println("construct method");
    }

    {
        this.a = 10;
    }

    public void Show() {
        {
            System.out.println(a);//a is ten
        }
    }

    public int GetASynchronized() {
        synchronized (padlock) {
            return a;
        }
    }

    public static void main(String[] args) {
        CodeBlockDemo blockDemo = new CodeBlockDemo();
        blockDemo.Show();
        System.out.println(blockDemo.GetASynchronized());
    }
}
