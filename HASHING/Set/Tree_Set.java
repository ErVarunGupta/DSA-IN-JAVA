package Set;
import java.util.*;
public class Tree_Set {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println("------HashSet------");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Patna");
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Bengaluru");
        System.out.println("------Linked HashSet-----");
        System.out.println(lhs);

        //LinkedHashSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Patna");
        ts.add("Mumbai");
        ts.add("Delhi");
        ts.add("Bengaluru");
        ts.add("bengaluru");
        System.out.println("-----TreeSet-----");
        System.out.println(ts);
    }
}
