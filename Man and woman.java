package en.codegym.task.jdk13.task05.task0526;

/* 
Man and woman
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("Jan", 33, "Warszawa");
        Man man2 = new Man("Adam", 41, "Gniezno");
        Woman woman1 = new Woman("Janina", 21, "Gdynia");
        Woman woman2 = new Woman("Ewa", 12, "Puck");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
//write your code here

