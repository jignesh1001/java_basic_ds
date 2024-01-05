public class binarySearch {
    public static int binarysearch(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if( arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,65,67,90,91,92};
        int m = 4;
        System.out.println(binarysearch(arr1, m));
    }
}
