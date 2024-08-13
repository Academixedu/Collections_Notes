import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets{
    public static void main(String[] args) {

Set<Integer> s=new HashSet<>();       
s.add(1);
s.add(1);
s.add(10);
s.add(2);
s.add(4);
for (Integer integer : s) {
    System.out.println(integer);
}

// Set<String> h=new HashSet<>();
// h.add("FB");
// h.add("Ea");
// 
//       for (String str : h) {
//      System.out.println(str);   
//       }
      
//    Set <Person>per=new HashSet<>();
//    per.add(new Person(1, "Chanakya", 234, "Dev"));
//    per.add(new Person(7, "Chanakya", 234, "Dev"));
//    per.add(new Person(7, "Chanakya", 234, "Dev"));
//    per.add(new Person(9, "Chanakya", 234, "Dev"));

//    for (Person person : per) {
//     System.out.println(person);
//    }

//    System.out.println("LinkedHashSet"); 
   
//    Set <Person>p1=new LinkedHashSet<>();
//  p1.add(new Person(1, "Chanakya", 234, "Dev"));
//    p1.add(new Person(8, "Chanakya", 234, "Dev"));

//    p1.add(new Person(7, "Chanakya", 234, "Dev"));
//    p1.add(new Person(9, "Chanakya", 234, "Dev"));

//    for (Person person : p1) {
//     System.out.println(person);
//    }

       }
        
}