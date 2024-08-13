import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
Map<Integer,String> m=new HashMap<Integer,String>();
m.put(1, "Dev");
m.put(2, null);
m.put(3, "Dev");
m.put(1, "SE");
m.put(1, "HR");

for ( Entry<Integer,String>string:m.entrySet()) {
    System.out.println(string);
}
System.out.println("---");

// for (String string : m.values()) {
//     System.out.println(string);
// }
// for (Integer intr : m.keySet()) {
//     System.out.println(intr);
// }

}
}
