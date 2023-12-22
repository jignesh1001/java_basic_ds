public class lowerToUpper {
    public static void main(String[] args) {
        String st = "Welcome to Mumbai";
        char strings [] = st.toCharArray();
        for(char x:strings){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int i =0 ;i<strings.length;i++){
            
            if(strings[i]>='A' && strings[i] <='Z'){
                strings[i] = (char)(strings[i] - 'A' + 'a');
            
            }
        }
        for(char x:strings){
            System.out.print(x + " ");
        }
    }
}
