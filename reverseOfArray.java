class reverseOfArray{
    public static void main(String[] args) {
        int arr[] = {1,2,33,44,22,3,43,3,78,76,54};
        int i = 0,j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}