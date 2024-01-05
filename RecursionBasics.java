public class RecursionBasics {
    public static void recursionBasics(int n){
         if(n == 0){
            return ;
         }
         recursionBasics(n-1);
         System.out.println(n);
    }
    public static void main(String[] args) {
        recursionBasics(10);
    }
}
