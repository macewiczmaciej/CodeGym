package en.codegym.task.jdk13.task02.task0202;

/* 
Where does a Person come from?
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Person person = new Person();
        person.name = "Jan";
        person.age = 33;
        person.weight = 85;
        person.money = 2500;
    }

    public static class Person {
        //write your code here
        String name;
        int age;
        int weight;
        int money;
    }
}
