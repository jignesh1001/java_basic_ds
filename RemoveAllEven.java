import java.util.ArrayList;

public class RemoveAllEven {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(45);
        nums.add(2);
        nums.add(21);
        removeAllEven(nums);
    }
    public static void removeAllEven( ArrayList<Integer> list){
          for(int i = list.size()-1;i>=0;i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
