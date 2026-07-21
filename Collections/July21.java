import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
public class July21{
    public static void main (String[] args){
        HashMap hh = new HashMap();
        hh.put("payilagam" , 23000);
        hh.put("Besant" , 25000);
        hh.put("Qspiders" , 35000);
        System.out.println(hh);
        System.out.println(hh.containsKey("heii"));
        System.out.println(hh.entrySet());
        System.out.println(hh.keySet());
        System.out.println(hh.values());
        System.out.println(hh.clone());
        System.out.println(hh.get(hh));
        Set set = hh.keySet();
        System.out.println(set);
        Iterator i = set.iterator();
        while (i.hasNext()){
            Object obj = i.next();
            Integer val = (Integer) hh.get(obj);
            System.out.println( obj + " " + val);
            hh.replace(obj , val +1000);

        }
        System.out.println(hh);

    }
}