import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<>();
        Set <Integer> set1 = new TreeSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(symmetricDifference(set1, set));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set <Integer>set3 = new TreeSet<>();
        for (int a : set1){
            set3.add(a);
        }
        for (int a : set2){
            set3.add(a);
        }

        return set3;
    }

}