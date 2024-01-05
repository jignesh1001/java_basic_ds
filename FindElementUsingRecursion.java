public class FindElementUsingRecursion {
    public static int firstIndex(int arr[],int x,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == x){
            return i;
        }
       int index = firstIndex(arr, x, i+1);
        return index;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        
        System.out.println(firstIndex(arr, 12, 0));
    }
}
