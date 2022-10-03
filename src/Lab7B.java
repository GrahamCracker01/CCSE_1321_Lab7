//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab7B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intSize;

        //get input
        System.out.print("Please enter a value for the size: ");
        intSize = scan.nextInt();

        //output
        System.out.println("This is the requested " + intSize + "x" + intSize + " right-triangle:");
        for (int rows = 0; rows < intSize; rows++) {
            for (int columns = 0; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}