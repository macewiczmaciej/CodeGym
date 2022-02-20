package en.codegym.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us
*/

public class Solution {
    public static Set<Integer> createSet() {
        // write your code here
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        Set<Integer> copy = new HashSet<>(set);
        for (Integer s : copy) {
            if (s > 10) {
                set.remove(s);
            }
        }
    }

    public static void main(String[] args) {

    }
}
