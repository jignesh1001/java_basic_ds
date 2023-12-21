import java.util.Arrays;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int arr1 [][] = {{1,2,3}
                        ,{1,2,13}
                        ,{2,33,22}};
        for(int i = 0;i<arr1.length;i++){
            System.out.print( Arrays.toString(arr1[i]));
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i<arr1.length;i++){
            for(int j= 0;j<i;j++){
               
                 int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            
            }

        }
        for(int i = 0;i<arr1.length;i++){
            System.out.print( Arrays.toString(arr1[i]));
            System.out.println();
        }
        
    }
}
