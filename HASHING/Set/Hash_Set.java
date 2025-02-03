package Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
