
package assignment5;

import java.util.Scanner;

public class ConversionProgram {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double number_in_meters;
        double kilometers = 1;
        double inches = 2; 
        double feet = 3;
        int close_Program = 4;
        double user_Choice = 0;
        
        System.out.println("Enter the the distance in meters: ");
            number_in_meters = keyboard.nextInt();
            
            while(number_in_meters <= 0){
                System.out.println("Please only enter a positive number.");
            
            System.out.println("Enter the the distance in meters: ");
            number_in_meters = keyboard.nextInt();
        }
            
            
            
            
            while(user_Choice != 4){ 
                
            menu();
            user_Choice = keyboard.nextDouble();
            while(user_Choice >=0 && user_Choice >=5 ){
                
                System.out.println("Please choose only from the"
                                   + " numbers in the menu");
                menu();
                user_Choice = keyboard.nextDouble();
            }
            
            if (user_Choice == kilometers)
            showKilometers(number_in_meters, kilometers);
            
            else if (user_Choice == inches)
                showInches(number_in_meters, inches);
           
            else if (user_Choice == feet)
                showFeet(number_in_meters, feet);
            
            else if (user_Choice == close_Program)
                System.out.println("\nBye :)");
            }  
    }
    
    
    
    public static void menu(){
       
    System.out.println("\nChoose the unit you wish to convert: "
                       + "\n1- Convert to Kilometers."
                       + "\n2- Convert to Inches."
                       + "\n3- Cconverto to Feet."
                       + "\n4- Quit the program.\n");
                 
   }
    
    
    public static void showKilometers(double original_num, double kilometers){
        
       kilometers = original_num * 0.001;
       System.out.printf("\n%.2f meters is %.2f in"
                       + " kilometers\n", original_num, kilometers);
    }
    
    
    public static void showInches(double original_num, double inches){
        
        inches = original_num * 39.37;
        System.out.printf("\n%.2f meters is %.2f in"
                        + " inches\n", original_num, inches);
    }
    
    
    public static void showFeet(double original_num, double feet){
        
        feet = original_num * 3.281;
        System.out.printf("\n%.2f meters is %.2f in"
                        + " feet\n", original_num, feet);
    }
}
