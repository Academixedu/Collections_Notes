import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic {
    public static void main(String[] args) {
        ArrayList<Person> a=new ArrayList<>();
        a.add(new Person(1,"Chanakya",3409,"dev"));
        a.add(new Person(1,"Chanakya",3409,"dev"));
        a.add(new Person(1,"Chanakya",3409,"dev"));
        System.out.println("Using For-Each Loop ");
        for(Person obj:a){
            System.out.println(obj);
        }
        System.out.println("Using Iterator");
        Iterator<Person> i=a.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("*************");
           }
}
