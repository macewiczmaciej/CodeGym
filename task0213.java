package en.codegym.task.jdk13.task02.task0213;

/* 
Every animal should have an owner
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman ann = new Woman();

        cat.owner = ann;
        dog.owner = ann;
        fish.owner = ann;


    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
