import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
 public static void main(String[] args) {
LinkedList<Integer> l=new LinkedList<>();    

// Head
// Iterator
l.add(1);
l.add(1);
l.add(3);
Iterator i=l.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}

}   
}
