package solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(026);
        String str = "pwwkew";
        int res = lengthOfLongestSubstring(str);
        System.out.println(res);
    }

//    public int myFunc(int x){
//        return 0;
//    }
//    public static int lengthOfLongestSubstring(String s){
//        int left = 0;
//        int right = 0;
//        int res = 0;
//
//        int[] record = new int[128];
//        while (right<s.length()){
//            char r = s.charAt(right);
//            record[r]++;
//            while(record[r]>1){
//                char l = s.charAt(left);
//                record[l]--;
//                left++;
//            }
//            res = Math.max(res, right-left+1);
//            right++;
//        }
//        return res;
//    }

    public static int lengthOfLongestSubstring(String s){
        Map<Character, Integer> myMap = new HashMap<>();
        int res = 0;
        for (int i=0,j=0; j<s.length(); j++){
            if (myMap.containsKey(s.charAt(j))){
                i = Math.max(i, myMap.get(s.charAt(j)));
            }
            res = Math.max(res, j-i+1);
            myMap.put(s.charAt(j), j+1);
        }
        return res;
    }

//    public int lengthOfLongestSubstring(String s){
//        int res=0;
//        int len = s.length();
//        if (len==1){
//            return 1;
//        }
//        for (int i=0; i<len; i++){
//            for (int j=i+1; j<len; j++){
//                char cur = s.charAt(j);
//                int index = s.substring(i,j).indexOf(cur);
//                if (index>=0){
//                    res = Math.max(res, j-i);
//                    break;
//                }
//                res = Math.max(res, j-i+1);
//            }
//        }
//        return res;
//    }
}
