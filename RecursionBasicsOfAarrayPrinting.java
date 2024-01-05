public class RecursionBasicsOfAarrayPrinting {
    public static void printArray(int arr[],int n){
        if(n <0){
            return;
        }
        System.out.println(arr[n]);
        printArray(arr, n-1);
    }
    public static void printArrayFromStart(int arr[],int n){
        if(n == arr.length){
            return ;
        
        }
        System.out.println(arr[n]);
        printArrayFromStart(arr, n+1);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,42,2,34};
        printArray(arr1, arr1.length-1);
        System.out.println();
        printArrayFromStart(arr1, 0);
    }
}
