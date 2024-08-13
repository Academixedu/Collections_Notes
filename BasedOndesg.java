import java.util.Comparator;

public class BasedOndesg implements Comparator<Person>{

@Override
public int compare(Person o1, Person o2) {
    return o1.getPdesg().compareTo(o2.getPdesg());
}}