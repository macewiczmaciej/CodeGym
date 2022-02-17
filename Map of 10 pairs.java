package en.codegym.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map of 10 pairs
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("watermelon", "melon");
        hashmap.put("banana", "fruit");
        hashmap.put("cherry", "fruit");
        hashmap.put("pear", "fruit");
        hashmap.put("cantaloupe", "melon");
        hashmap.put("blackberry", "fruit");
        hashmap.put("ginseng", "root");
        hashmap.put("strawberry", "fruit");
        hashmap.put("iris", "flower");
        hashmap.put("potato", "tuber");

        for (Map.Entry<String, String> hash : hashmap.entrySet()) {
            System.out.println(hash.getKey() + " - " + hash.getValue());
        }
    }
}
