import java.util.Arrays;
import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        int arr[][] = {{1,2,3},{23,22,11},{1,3,4}};

        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<m;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }
        convertToString(arr);
    } 
    public static void convertToString(int arr[][]){
        for(int i = 0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void convertToString(int arr[][],int n,int m){
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
