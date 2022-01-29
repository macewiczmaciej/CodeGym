package en.codegym.task.jdk13.task05.task0522;

/* 
Max constructors
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //write your code here
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(){

    }
    public Circle(Circle circle){
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }
    public Circle(double x, double y){
        this(x,y,15);
    }

    public static void main(String[] args) {

    }
}
