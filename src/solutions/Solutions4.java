package solutions;

class Solution4 {
    public static void main(String[] args) {
        String test = longestPalindrome("abbba");
        System.out.println(test);
    }

    // Expand Around Center
    public static String longestPalindrome(String s){
        int start=0, end=0;
        for (int i=0; i<s.length(); i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len1, len2);
            if (len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start, end+1);
    }

    public static int expand(String s, int L, int R){
        while (L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
//    public static String longestPalindrome(String s){
//        int n=s.length();
//        boolean dp[][] = new boolean[n][n];
//        int m=1;
//
//        if (n==0){
//            return "";
//        }
//
//        for (int i=0; i<n; i++){
//            dp[i][i] = true;
//        }
//
//        char a,b;
//        int j;
//        int start = 0;
//        for (int i=0; i<n-1; i++){
//            a = s.charAt(i);
//            b = s.charAt(i+1);
//            if (a==b){
//                dp[i][i+1]=true;
//                start = i;
//                m = 2;
//            }
//        }
//
//        for (int l=n; l>=2; l--){
//            for (int i=0; i<n-l+1; i++){
//                j=n-l+1;
//                if (dp[i+1][j-1] && s.charAt(i)==s.charAt(j)){
//                    dp[i][j] = true;
//                    if(j-i+1>m){
//                        m = j-i+1;
//                        start = i;
//                    }
//                }
//            }
//        }
//        return s.substring(start, start+m);
//    }
    // Brute Force

//    public static String longestPalindrome(String s) {
//        String res = "";
//        int len = s.length();
//        for (int i=0; i<len; i++){
//            for (int j=0; i+j<len; j++){
//                String subString = s.substring(i,i+j+1);
//                if (checkPali(subString) && subString.length()>res.length()){
//                    res = subString;
//                }
//            }
//        }
//        return res;
//    }
//    public static boolean checkPali(String s){
//        int len = s.length();
//        for (int i=0; i<len/2; i++){
//            if (s.charAt(i)!=s.charAt(len-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }
}
