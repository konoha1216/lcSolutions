package solutions;

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String res = "";
        String pivot = strs[0];
        int len = pivot.length();
        for(int i=0; i<len; i++){
            for(int j=0; j<strs.length; j++){
                if(i==strs[j].length() ||(strs[j].charAt(i) != pivot.charAt(i))) {
                    return res;
                }
            }
            res = res+pivot.charAt(i);
        }

        return res;
    }
}
