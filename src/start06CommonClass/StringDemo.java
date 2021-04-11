package start06CommonClass;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = new String("aaa");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        s2 = s2.intern();
        System.out.println(s1 == s2);//true
        String s3 = "a";
        String s4 = "b";
        String s5 = "a" + "b";
        String s6 = "ab";
        String s7 = s3 + s4;
        System.out.println(s5 == s6);//true
        System.out.println(s5 == s7);//false
        //remember always use equals

        StringBuilder stringBuilder = new StringBuilder();// default capacity is 16  线程不安全
        for (int i = 0; i < 10; i ++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer();// 线程安全
        for (int i = 0; i < 10; i ++) {
            stringBuffer.append(i);
        }
        System.out.println(stringBuffer.toString());
    }
}
