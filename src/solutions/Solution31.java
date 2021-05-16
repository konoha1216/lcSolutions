package solutions;

public class Solution31 {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        for(; i>0; i--){
            if(nums[i-1]<nums[i]){
                break;
            }
        }
        if(i>0){
            System.out.print(i);
            int j = nums.length-1;
            while(nums[j]<=nums[i-1]){
                j--;
            }
            swap(nums,i-1,j);
        }
        reverse(nums,i);
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
