package en.codegym.task.jdk13.task05.task0517;

/* 
Creating cats
*/

public class Cat {
    //write your code here
    public String name;
    public int weight;
    public int age;
    public String color;
    public String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 3;
        this.age = 2;
        color = "Black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        color = "Black";
    }

    public Cat(int weight, String color) {
        this.age = 2;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 4;
    }


    public static void main(String[] args) {

    }
}
