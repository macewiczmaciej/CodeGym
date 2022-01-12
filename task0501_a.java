package en.codegym.task.jdk13.task05.task0501;

/* 
Cat carnage (1)
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1",2,2,2);
        Cat cat2 = new Cat("Cat2",3,3,3);
        Cat cat3 = new Cat("Cat3",4,4,4);
    }

    public static class Cat {
        //write your code here
        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        private String name;
        private int age;
        private int weight;
        private int strength;
    }
}
