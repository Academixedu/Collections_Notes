import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> t=new TreeSet<>();
        t.add("Abhishek");
        t.add("Fayaz");
        t.add("Chanakya");
        Iterator i=t.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
 
    }
}
