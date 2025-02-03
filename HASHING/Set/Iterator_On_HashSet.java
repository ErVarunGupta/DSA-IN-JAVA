package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_On_HashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Patna");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        //using iterator
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //using advance for loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}
