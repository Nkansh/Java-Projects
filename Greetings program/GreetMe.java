/*The program ask user for name and greets him 
or her with the name.
author:Albert Nkansah
date:15/01/2021
*/



import java.util.Scanner; //imports the scanner class

class GreetMe{
    public static void main(String[] args){
        //Create an instance of the scanner class
        Scanner sc = new Scanner(System.in); 

        //prompt user to enter name 
        System.out.print("Enter name: ");

        //assigns the the user input to the name variable
        String name = sc.next();

        //print out the greeting to the console 
        System.out.println("Hello "+name+" and welcome to Java programming.");


    }


}