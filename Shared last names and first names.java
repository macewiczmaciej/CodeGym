package en.codegym.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        Map<String,String> map = new HashMap<>();
        map.put("Manuel", "Neuer");
        map.put("Niclas","Sule");
        map.put("Benjamin","Pavard");
        map.put("Mariusz","Lewandowski");
        map.put("Alphonso","Davies");
        map.put("Leon","Goretzka");
        map.put("Kinsley","Coman");
        map.put("Benjamin","Mendy");
        map.put("Serge","Gnabry");
        map.put("Robert","Lewandowski");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
