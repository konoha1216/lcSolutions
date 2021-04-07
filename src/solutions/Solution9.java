package solutions;

public class Solution9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-6));
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String str="";
        while(x>0){
            int pop = x%10;
            str = str+pop;
            x = x/10;
        }
        int len = str.length();
        for (int i=0; i<len; i++){
            if (str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
