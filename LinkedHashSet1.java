import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>p=new LinkedHashSet<>();
        p.add(1);
        p.add(3);
        p.add(3);
        p.add(2);
        for (Integer integer : p) {
            System.out.println(integer);
        }
    }
}
