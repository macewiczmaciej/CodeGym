package en.codegym.task.pro.task06.task0607;

/* 
Welcome! But not everyone.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        //write your code here
        if(username.equals("user")){
            return;
        }else{
            System.out.println("Welcome, " + username);
            System.out.println("We've really missed you, " + username);
        }

    }
}
