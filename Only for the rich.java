package en.codegym.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //write your code here
        Map<String, Integer> map = new HashMap<>();
        map.put("Smith", 500);
        map.put("Johnson", 300);
        map.put("Williams", 2000);
        map.put("Brown", 550);
        map.put("Jones", 200);
        map.put("Garcia", 600);
        map.put("Miller", 700);
        map.put("Davis", 850);
        map.put("Rodriguez", 725);
        map.put("Martinez", 530);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //write your code here
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> object : copy.entrySet()) {
            if (object.getValue() < 500) {
                map.remove(object.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
