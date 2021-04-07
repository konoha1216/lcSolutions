package solutions;

class Solution12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static String intToRoman(int num) {
        String res = "";
        for (int i=0; i<values.length && num>0; i++){
            while (values[i]<=num){
                System.out.println(num+" "+values[i]);
                num = num-values[i];
                res = res+symbols[i];
            }
        }
        return res;
    }
}
