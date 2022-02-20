package en.codegym.task.jdk13.task08.task0817;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats
*/

public class Solution {
    public static Map<String, String> createMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();

        map.put("Smith", "Sophia");
        map.put("Johnson", "Isabella");
        map.put("Williams", "Jacob");
        map.put("Brown", "Mason");
        map.put("Jones", "William");
        map.put("Garcia", "Jayden");
        map.put("Miller", "Emily");
        map.put("Davis", "Abigail");
        map.put("Rodriguez", "Mia");
        map.put("Martinez", "Joshua");
        return map;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        Map<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String nameCopy : map.values()) {
                if (nameCopy.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
