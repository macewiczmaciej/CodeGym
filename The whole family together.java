package en.codegym.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
The whole family together
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human children1 = new Human("Maciej", true, 23);
        Human children2 = new Human("Wojciech", true, 21);
        Human children3 = new Human("Jan", true, 13);
        Human father = new Human("Paweł", true, 49, children1, children2, children3);
        Human mother = new Human("Małgorzata", false, 51, children1, children2, children3);
        Human grandfather1 = new Human("Jerzy", true, 81, mother);
        Human grandfather2 = new Human("Andrzej", true, 88, father);
        Human grandmother1 = new Human("Ewa", false, 80, mother);
        Human grandmother2 = new Human("Genowefa", false, 75, father);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());

    }

    public static class Human {
        //write your code here
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            for (Object o : children) {
                this.children.add((Human) o);
            }
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
