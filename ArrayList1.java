import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
       for(int i=1;i<=50;i++){
        a.add(i);
       }
       for (Integer integer : a) {
        System.out.println(integer);
       }
        int size=a.size();
        System.out.println("Size : "+size);
      System.out.println(a.get(0));

    }
}
