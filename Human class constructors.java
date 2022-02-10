package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String firstName;
        private String lastName;
        private int age;
        private String country;
        private int phone;
        private double accountBalance;

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, int age, String country) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.country = country;
        }

        public Human(String firstName, String lastName, int age, String country, int phone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.country = country;
            this.phone = phone;
        }

        public Human(String firstName, String lastName, int age, String country, int phone, double accountBalance) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.country = country;
            this.phone = phone;
            this.accountBalance = accountBalance;
        }

        public Human() {
            this.firstName = "Noname";
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int phone, double accountBalance) {
            this.phone = phone;
            this.accountBalance = accountBalance;
        }

        public Human(double accountBalance) {
            this.accountBalance = accountBalance;
        }
    }

}
