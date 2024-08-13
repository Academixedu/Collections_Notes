import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(5);
        h.add(5);
        h.add(3);
        for (Integer integer : h) {
            System.out.println(integer);
        }
        HashSet<String>h1=new HashSet<>();
        // HashCode Sai A123
        // Abhishek B143
        // Fayaz C987
        h1.add("Sai");
        h1.add("Fayaz");
        h1.add("Abhishek");
                Iterator<String> i=h1.iterator();
                while(i.hasNext()){
                    System.out.println(i.next());
                }
    HashSet<Person> h3=new HashSet<>();
    // 12+68+10+23=113
    // 12+68+10+23=113
    h3.add(new Person(1, "Chanakya", 3445, "Dev"));
    h3.add(new Person(2, "Abhishek", 77683482, "Dev"));
    h3.add(new Person(1, "Chanakya", 3445, "Dev"));
    for (Person person : h3) {
        System.out.println(person);
    }
            }
}
