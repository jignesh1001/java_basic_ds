public class vowelsInString {
    public static void main(String[] args) {
        String str = "Welcome to Scaler";
        printStr(str);
        removeVowels(str);
    }
     public static void printStr(String str){
        for(int i =0;i<str.length();i++){
            
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
     }
    
    public static void removeVowels(String str){
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch == 'u'){
                continue;
            }
            System.out.print(ch + " ");
        }
    }
}
