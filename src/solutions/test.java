package solutions;

public class test {
    public static void fun(int x, int y, int z){
        z = x*x + y*y;
    }
    public static void main(String[] args) {
        int a = 10;
        fun(6,2,a);
        System.out.println(a);
    }
}
