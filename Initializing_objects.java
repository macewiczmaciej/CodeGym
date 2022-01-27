package en.codegym.task.jdk13.task05.task0514;

/* 
Initializing objects
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Person person = new Person();
        person.initialize("Jan", 33);
    }

    static class Person {
        //write your code here
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
