package solutions;

public class Solutions {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        while(low<high){
            while(low<high && arr[high]>=pivot){
                high--;
            }
            arr[low] = arr[high];

            while(low<high && arr[low]<= pivot){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public static void qsort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int pivot = partition(arr, low, high);
        qsort(arr,low, pivot-1);
        qsort(arr, pivot+1, high);
    }

    public static void mysort(int[] arr){
        qsort(arr, 0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] myArr = {9,8,7,6,5,4};
        mysort(myArr);
        for (int i=0; i<myArr.length; i++){
            System.out.print(myArr[i]);
        }
    }
}
