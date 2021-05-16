package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Solution20 {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        String s = "([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');

        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if (hashMap.containsKey(cur)){
                if(stack.empty()){
                    return false;
                }
                char prev = stack.pop();
                if(hashMap.get(cur) != prev){
                    return false;
                }
            }else{
                stack.push(cur);
            }
        }
        if (stack.size()!=0){
            return false;
        }else {
            return true;
        }
    }
}
