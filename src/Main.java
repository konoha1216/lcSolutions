public class Main {

    public static void main(String[] args) {
        System.out.println(14/5);
	// write your code here
        int a = 12;
        long l = 23;
        double d = 123;
        float f = 12;
        f = l;
        char c = '@';
        a = c;
        System.out.println(a);
        char c1 = 65;
        char c2 = '\u003d';
        char c3 = '中';
        char 中文 = '文';
        System.out.println(c3);
        System.out.println(中文);
        System.out.println(c2);
        c = (char)d;
        System.out.println(c1);
        System.out.println(c);
        System.out.println(l);
        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
        double d2 = 123e4;
        System.out.println(d2);
        float f2 = 1.2E4F;
        System.out.println(f2);
        double d3 = .2e-3/4;
        System.out.println(d3);
    }
}
