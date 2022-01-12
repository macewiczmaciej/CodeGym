package en.codegym.task.jdk13.task05.task0501;

/* 
Cat carnage (1)
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 4, 3, 3);
        Cat cat2 = new Cat("Cat2", 3, 3, 3);
        Cat cat3 = new Cat("Cat3", 4, 4, 4);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {
        //write your code here
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat opponent) {
            int strengthPoint = Integer.compare(this.strength, opponent.strength);
            int weigthPoint = Integer.compare(this.weight, opponent.weight);
            int agePoint = Integer.compare(this.age, opponent.age);
            int score = strengthPoint + weigthPoint + agePoint;
            return score > 0;
        }


    }
}
