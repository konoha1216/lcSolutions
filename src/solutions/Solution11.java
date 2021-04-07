package solutions;

class Solution11 {

    public static void main(String[] args) {
        int[] h = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(h);
        System.out.println(res);
    }

    public static int maxArea(int[] height){
        int res = 0;
        int low = 0;
        int high = height.length-1;

        while(low<high){
            int cur = Math.min(height[low], height[high]) * (high-low);
            if (cur>res){
                res = cur;
            }

            if (height[low]< height[high]){
                low++;
            }else{
                high--;
            }
        }
        return res;
    }
    // brute Force
//    public static int maxArea(int[] height) {
//        int res = 0;
//        int len = height.length;
//
//        for (int i=0; i<len; i++){
//            for (int j=i; j<len; j++){
//                int cur = Math.min(height[j], height[i])*(j-i);
//                if (cur > res){
//                    res = cur;
//                }
//            }
//        }
//
//        return res;
//    }
}
