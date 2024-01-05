import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();
        
        list.add(10);
        list.add(12);
        list.add(14);

        list.add(0,111);
        
        System.out.println(  list.get(2));
        
        list.set(2,343);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        sc.close();
        System.out.println(list.size());;

    }
}
