/*
 This programme calculates the Area of a given circle
 Author: Albert Owusu Nkansah
 Date: 19/01/2021

*/
import java.util.Scanner; //import the scanner class 

class AreaOfACircle{
    public static void main(String []args){

        final double PI = 3.142;       //declare the PI as constant using the final keyword before the datatype.

        Scanner sc = new Scanner(System.in);
        //the code statement above creates a scanner object called sc which accept input from the user

        System.out.print("Enter radius: ");
       // System.out.print("\n"

        float radius = sc.nextInt();
        //sc object takes input from the user using the .nextInt() method.


        double area = PI * radius * radius;
        //The above statement assigns the the expression on your right to the area.


        System.out.println( "The area is " + area);



    }

}