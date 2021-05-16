package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        String s = "";
        int value = 0;
        int len = 0;
        List<String> res = new ArrayList<>();

        generate(s,value,len,res,n);
        return res;
    }
    public static void generate(String s, int value, int len, List<String> res,int n){
        if(value<0 || len>2*n) return;
        if(len==2*n && value==0){
            res.add(s);
            return;
        }
        generate(s+"(",value+1,len+1,res,n);
        generate(s+")",value-1,len+1,res,n);
    }
}
