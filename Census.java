package en.codegym.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Census
*/

public class Solution {
    public static Map<String, String> createMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();

        map.put("Jan", "Kowalski");
        map.put("Piotr", "Nowak");
        map.put("Paweł", "Strójwąs");
        map.put("Maciej", "Wąsik");
        map.put("Szymon", "Kaczyński");
        map.put("Jarosław", "Kaczyński");
        map.put("Lech", "Wałęsa");
        map.put("Jakub", "Rozpruwacz");
        map.put("Janusz", "Kowalski");
        map.put("Zbigniew", "Ziobro");

        return map;

    }

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        //write your code here
        int counter = 0;
        for (String n : map.values()) {
            if (n.equals(name)) {
                counter += 1;
            }
        }
        return counter;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        //write your code here
        int counter = 0;
        for (String l : map.keySet()) {
            if (l.equals(lastName)) {
                counter += 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
    }
}
