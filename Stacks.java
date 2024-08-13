import java.util.Enumeration;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        Enumeration e=s.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(s.peek());
    }
}
