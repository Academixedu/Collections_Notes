import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        
Set<Integer> s=new HashSet<>();       
s.add(1);
// 234
s.add(1);
// 234
s.add(10);
s.add(2);
s.add(4);
for (Integer integer : s) {
    System.out.println(integer);
}
Set<Person> t=new LinkedHashSet();
t.add(new Person(1, "Chanakya", 34, "dev"));
t.add(new Person(3, "Chanakya", 34, "dev"));
t.add(new Person(2, "Chanakya", 34, "dev"));
// B123
for (Person person : t) {
    System.out.println(person);
}
Comparator<Person> p=null;
Scanner in=new Scanner(System.in);
System.out.println("1.Based On Name");
System.out.println("2.Based on Desg");
int id=in.nextInt();
if(id==1){
    p=new BasedOnName();
}
else if(id==2){
    p=new BasedOndesg();
}
Set<Person>t1=new TreeSet<>(p);
t1.add(new Person(1, "Chanakya", 34, "SE"));
t1.add(new Person(3, "Ravi", 34, "dev"));
t1.add(new Person(2, "Ram", 34, "Hr"));
for (Person person : t1) {
    System.out.println(person);
}

}
}
