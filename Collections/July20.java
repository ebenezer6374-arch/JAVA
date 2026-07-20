import java.util.*;

public class July20{
 public static void main (String[] args){
     LinkedList eb = new LinkedList<>();
     eb.add(67);
     eb.add(23);
     eb.add(63);
     System.out.println(eb);
     System.out.println(eb.get(2));
     eb.set(1,3);
     System.out.println(eb);
     System.out.println(eb.size());

    Collections.sort(eb ,Collections.reverseOrder());
    System.out.println(eb);
    Collections.swap(eb, 0 ,1);
    System.out.println(eb);
//     TreeSet en = new TreeSet();
//     en.add(67);
//     en.add(34);
//     en.add(34);
////     en.add("hi");
//     en.add(28);
//     en.add(99);
////en.removeLast();
//     Iterator e = en.iterator();
//     Boolean res = e.hasNext();
//     System.out.println(res);
//     System.out.println(e.next());
//     System.out.println(e.next());





//     System.out.println(en);
 }
}