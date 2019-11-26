/*
 *  Author: Chas Lutterloh
 *  Date:   11/18/2019
 *  Version: 1.0.1
 *  Purpose: An application that parses full names into first middle and last names.
 */

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // setup variables
        Boolean isValid = false;
        String firstName = "";
        String middleName = "";
        String lastName = "";
        
        // loop runs while isValid
        while (!isValid) {
            
            // gets user input
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.println();
            name = name.trim();
            
            // get index values for spaces
            int index1 = name.indexOf(" ");
            int index2 = name.indexOf(" ", index1+1);
            int index3 = -1;
            
            // test index to see if there is a third word
            if (index2 != -1) {
               index3 = name.indexOf(" ", index2+1);
            }
            
            // test to see if valid
            if (index1 != -1) {
                if (index3 == -1) {
                    isValid = true;
                } else {
                    System.out.print("Error! Name must be entered as two or three words. Try again.");
                    System.out.println();
                }
            } else {
                System.out.print("Error! Name must be entered as two or three words. Try again.");
                System.out.println();
            }
            
            // if data is valid
            if (isValid == true) {
                // use substring to return string object at specified start index and go to end index
                firstName = name.substring(0, index1);


                // check if a middle name exists and setup middle and last names
                if (index2 == -1) {
                    lastName = name.substring(index1);
                } else {
                    middleName = name.substring(index1, index2);
                    lastName = name.substring(index2);
                }
            
            // print results if data is valid
            
                // print results        
                System.out.print("First name: ");
                System.out.print(firstName);
                System.out.println();
                // if a middle name exists print it
                if (index2 != -1) {
                    System.out.print("Middle name: ");
                    System.out.print(middleName);
                    System.out.println();
                }
                System.out.print("Last name: ");
                System.out.print(lastName);
                System.out.println();
            }
            
        }
    }
    
}
