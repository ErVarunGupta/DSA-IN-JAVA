package Set;

import java.util.LinkedHashSet;

public class Linked_HashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Patna");
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Bengaluru");

        System.out.println(lhs);
        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
